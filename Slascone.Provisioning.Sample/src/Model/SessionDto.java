package Model;

import java.util.UUID;

public class SessionDto {

	public UUID license_id = null;
	
	public String client_id = null;
	
	public SessionDto() {
		super();
	}

	public SessionDto(UUID license_id, String client_id) {
		super();
		this.license_id = license_id;
		this.client_id = client_id;
	}

	public UUID getLicense_id() {
		return license_id;
	}

	public void setLicense_id(UUID license_id) {
		this.license_id = license_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

}
