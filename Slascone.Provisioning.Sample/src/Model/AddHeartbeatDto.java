package Model;

import java.util.UUID;

public class AddHeartbeatDto {
	public UUID product_id = null;
	
	public String client_id = null;
	
	public String software_version = null;
	
	public String operating_system = null;
	
	public String token_key = null;
	
	public String group_id = null;
	
	public UUID heartbeat_type_id = null;
	
	public AddHeartbeatDto() {
		super();
	}

	public AddHeartbeatDto(UUID product_id, String client_id, String software_version, String operating_system,
			String token_key, String group_id, UUID heartbeat_type_id) {
		super();
		this.product_id = product_id;
		this.client_id = client_id;
		this.software_version = software_version;
		this.operating_system = operating_system;
		this.token_key = token_key;
		this.group_id = group_id;
		this.heartbeat_type_id = heartbeat_type_id;
	}

	public UUID getProduct_id() {
		return product_id;
	}

	public void setProduct_id(UUID product_id) {
		this.product_id = product_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSoftware_version() {
		return software_version;
	}

	public void setSoftware_version(String software_version) {
		this.software_version = software_version;
	}

	public String getOperating_system() {
		return operating_system;
	}

	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}

	public String getToken_key() {
		return token_key;
	}

	public void setToken_key(String token_key) {
		this.token_key = token_key;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public UUID getHeartbeat_type_id() {
		return heartbeat_type_id;
	}

	public void setHeartbeat_type_id(UUID heartbeat_type_id) {
		this.heartbeat_type_id = heartbeat_type_id;
	}
	
	
}
