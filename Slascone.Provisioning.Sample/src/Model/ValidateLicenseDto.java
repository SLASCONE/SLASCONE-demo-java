package Model;

public class ValidateLicenseDto {
	public String license_key = null;
	
	public ValidateLicenseDto() {
		super();
	}
	
	public ValidateLicenseDto(String license_key) {
		super();
		this.license_key = license_key;
	}

	public String getLicense_key() {
		return license_key;
	}

	public void setLicense_key(String license_key) {
		this.license_key = license_key;
	}
}
