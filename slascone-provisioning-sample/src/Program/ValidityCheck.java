package Program;

import java.time.OffsetDateTime;
import java.util.Date;

import com.slascone.model.DateValidity;
import com.slascone.model.LicenseDto;
import com.slascone.model.LicenseInfoDto;
import com.slascone.model.SoftwareReleaseLimitationDto;

import Model.LicenseXml;
import Model.SoftwareReleaseLimitationXml;

public class ValidityCheck {

    static boolean CheckLicenseValidity(LicenseDto licenseDto) {
        if (licenseDto == null) {
            System.out.println("Error: No license information available.");
            return false;
        }

        System.out.println();
        System.out.println("License Validity Status:");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("===> License is " + (Boolean.TRUE.equals(licenseDto.getIsValid()) ? "valid" : "not valid") + " <===");
        System.out.println();

        DateValidity dateValidity = licenseDto.getDateValidity();
        if (Boolean.TRUE.equals(licenseDto.getIsValid()) && dateValidity == DateValidity.NUMBER_0) {
            if (licenseDto.getExpirationDateUtc() != null) {
                if (licenseDto.getExpirationDateUtc().getYear() >= 9999) {
                    System.out.println("This is a perpetual license.");
                } else {
                    System.out.println("License is valid until " + licenseDto.getExpirationDateUtc() + ".");
                }
            }
        } else if (dateValidity != null) {
            switch (dateValidity) {
                case NUMBER_1:
                    System.out.println("License is not valid yet."
                        + (licenseDto.getStartDateUtc() != null ? " (Start Date: " + licenseDto.getStartDateUtc() + ")" : ""));
                    break;
                case NUMBER_2:
                    System.out.println(licenseDto.getExpirationDateUtc() != null
                        ? "License has expired.since " + licenseDto.getExpirationDateUtc() + "."
                        : "License has expired.");
                    break;
                default:
                    break;
            }
        }

        if (!Boolean.TRUE.equals(licenseDto.getIsValid()) && !Boolean.TRUE.equals(licenseDto.getIsActive())) {
            System.out.println("License is deactivated.");
        }

        if (dateValidity != null) {
            if (dateValidity == DateValidity.NUMBER_1) {
                System.out.println("This license is not yet valid. Valid from " + licenseDto.getStartDateUtc());
                return false;
            }
            if (dateValidity == DateValidity.NUMBER_2) {
                System.out.println("This license is expired. Expired at " + licenseDto.getExpirationDateUtc());
                return false;
            }
        }

        if (!Boolean.TRUE.equals(licenseDto.getIsActive())) {
            System.out.println("This license is deactivated.");
            return false;
        }

        SoftwareReleaseLimitationDto swLimitation = licenseDto.getSoftwareReleaseLimitation();
        if (swLimitation == null) {
            return true;
        }

        String limit = swLimitation.getSoftwareRelease();
        if (limit == null || limit.isEmpty()) {
            return true;
        }

        System.out.println();
        System.out.println("Software Version Information:");
        System.out.println("----------------------------");
        System.out.println("Software Release Limit: " + swLimitation.getSoftwareRelease());

        if (swLimitation.getDescription() != null && !swLimitation.getDescription().isEmpty()) {
            System.out.println("Description: " + swLimitation.getDescription());
        }

        if (ReleaseCheck.compareRelease(limit, Settings.SOFTWARE_VERSION) < 0) {
            System.out.println();
            System.out.println("===> Software version " + Settings.SOFTWARE_VERSION + " is not compliant <===");
            System.out.println();
            return false;
        }

        System.out.println("Software version is compliant.");
        return true;
    }

    static boolean CheckLicenseValidity(LicenseInfoDto licenseInfoDto) {
        if (licenseInfoDto == null) {
            System.out.println("Error: No license information available.");
            return false;
        }

        System.out.println();
        System.out.println("License Validity Status:");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("===> License is " + (Boolean.TRUE.equals(licenseInfoDto.getIsLicenseValid()) ? "valid" : "not valid") + " <===");
        System.out.println();

        DateValidity dateValidity = licenseInfoDto.getDateValidity();
        if (Boolean.TRUE.equals(licenseInfoDto.getIsLicenseValid()) && dateValidity == DateValidity.NUMBER_0) {
            OffsetDateTime expiration = licenseInfoDto.getExpirationDateUtc();
            if (expiration != null && expiration.getYear() >= 9999) {
                System.out.println("This is a perpetual license.");
            } else {
                System.out.println("License is valid until " + licenseInfoDto.getExpirationDateUtc() + ".");
            }
        } else if (dateValidity != null) {
            switch (dateValidity) {
                case NUMBER_1:
                    System.out.println("License is not valid yet."
                        + (licenseInfoDto.getStartDateUtc() != null ? " (Start Date: " + licenseInfoDto.getStartDateUtc() + ")" : ""));
                    break;
                case NUMBER_2:
                    System.out.println(licenseInfoDto.getExpirationDateUtc() != null
                        ? "License has expired.since " + licenseInfoDto.getExpirationDateUtc() + "."
                        : "License has expired.");
                    break;
                default:
                    break;
            }
        }

        if (!Boolean.TRUE.equals(licenseInfoDto.getIsLicenseValid())
            && !Boolean.TRUE.equals(licenseInfoDto.getIsLicenseActive())) {
            System.out.println("License is deactivated.");
        }

        if (dateValidity != null) {
            if (dateValidity == DateValidity.NUMBER_1) {
                System.out.println("This license is not yet valid. Valid from " + licenseInfoDto.getStartDateUtc());
                return false;
            }
            if (dateValidity == DateValidity.NUMBER_2) {
                System.out.println("This license is expired. Expired at " + licenseInfoDto.getExpirationDateUtc());
                return false;
            }
        }

        if (!Boolean.TRUE.equals(licenseInfoDto.getIsLicenseActive())) {
            System.out.println("This license is deactivated.");
            return false;
        }

        SoftwareReleaseLimitationDto swLimitation = licenseInfoDto.getSoftwareReleaseLimitation();
        if (swLimitation != null) {
            System.out.println();
            System.out.println("Software Version Information:");
            System.out.println("----------------------------");
            if (Boolean.TRUE.equals(licenseInfoDto.getIsSoftwareVersionValid())) {
                System.out.println("Software version is valid");
            } else {
                System.out.println();
                System.out.println("===> Software version is not valid <===");
                System.out.println();
            }
            System.out.println("Enforce Software Upgrade: " + licenseInfoDto.getEnforceSoftwareVersionUpgrade());

            if (swLimitation.getSoftwareRelease() != null && !swLimitation.getSoftwareRelease().isEmpty()) {
                System.out.println("Software Release: " + swLimitation.getSoftwareRelease());
            }

            if (swLimitation.getDescription() != null && !swLimitation.getDescription().isEmpty()) {
                System.out.println("Description: " + swLimitation.getDescription());
            }
        }

        return Boolean.TRUE.equals(licenseInfoDto.getIsSoftwareVersionValid());
    }

    static boolean CheckLicenseValidity(LicenseXml license) {
        if (license == null) {
            System.out.println("Error: No license information available.");
            return false;
        }

        Date expiration = license.getExpirationDateUtc();
        boolean hasExpiration = expiration != null;
        boolean isPerpetual = hasExpiration && expiration.getYear() >= 9999;
        boolean isExpired = hasExpiration && !isPerpetual && expiration.before(new Date());
        boolean isDateValid = !isExpired;

        System.out.println();
        System.out.println("License Validity Status:");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("===> License is " + (isDateValid ? "valid" : "not valid") + " <===");
        System.out.println();

        if (isDateValid) {
            if (isPerpetual) {
                System.out.println("This is a perpetual license.");
            } else if (hasExpiration) {
                System.out.println("License is valid until " + expiration + ".");
            }
        } else {
            System.out.println("License has expired." + (hasExpiration ? " since " + expiration + "." : ""));
            System.out.println("This license is expired. Expired at " + expiration);
            return false;
        }

        SoftwareReleaseLimitationXml swLimitation = license.getSoftwareReleaseLimitation();
        if (swLimitation == null) {
            return true;
        }

        String limit = swLimitation.getSoftwareReleaseName();
        if (limit == null || limit.isBlank()) {
            return true;
        }

        System.out.println();
        System.out.println("Software Version Information:");
        System.out.println("----------------------------");
        System.out.println("Software Release Limit: " + limit);

        int compare = ReleaseCheck.compareRelease(limit, Settings.SOFTWARE_VERSION);
        boolean isCompliant = 0 <= compare;

        if (!isCompliant) {
            System.out.println();
            System.out.println("===> Software version " + Settings.SOFTWARE_VERSION + " is not compliant <===");
            System.out.println();
            return false;
        }

        System.out.println("Software version is compliant.");
        return true;
    }
}
