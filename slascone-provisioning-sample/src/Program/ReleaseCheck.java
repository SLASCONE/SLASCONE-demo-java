package Program;

import java.util.ArrayList;
import java.util.List;

final class ReleaseCheck {
    private ReleaseCheck() {
    }

    static int compareRelease(String releaseLimitation, String softwareVersion) {
        List<String> releaseLimitationParts = splitRelease(releaseLimitation);
        List<String> softwareVersionParts = splitRelease(cleanSoftwareVersion(softwareVersion));

        if (softwareVersionParts.size() < releaseLimitationParts.size()) {
            throw new IllegalArgumentException("Release has too few parts.");
        }

        for (int i = 0; i < releaseLimitationParts.size(); i++) {
            try {
                int limitationPart = Integer.parseInt(releaseLimitationParts.get(i));
                int versionPart = Integer.parseInt(softwareVersionParts.get(i));
                if (limitationPart < versionPart) {
                    return -1;
                }
                if (limitationPart > versionPart) {
                    return 1;
                }
            } catch (RuntimeException ex) {
                throw new IllegalArgumentException("Version format error.");
            }
        }

        // Extra parts in softwareVersion are ignored.
        return 0;
    }

    private static List<String> splitRelease(String release) {
        List<String> parts = new ArrayList<>();
        if (release == null || release.isBlank()) {
            return parts;
        }

        String[] tokens = release.split("\\.");
        for (String token : tokens) {
            parts.add(token);
        }
        return parts;
    }

    private static String cleanSoftwareVersion(String softwareVersion) {
        if (softwareVersion == null) {
            return "";
        }
        return softwareVersion.replaceAll("[a-zA-Z]", "");
    }
}