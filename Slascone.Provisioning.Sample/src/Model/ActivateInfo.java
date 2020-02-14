package Model;

public class ActivateInfo {
	private String product_id = null;
	
	private String license_key = null;
	
	private String client_id = null;
	
	private String client_name = null;
	
	private String client_description = null;
	
	public ActivateInfo() {
		super();
	}

	public ActivateInfo(String product_id, String license_key, String client_id, String client_name,
			String client_description) {
		super();
		this.product_id = product_id;
		this.license_key = license_key;
		this.client_id = client_id;
		this.client_name = client_name;
		this.client_description = client_description;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getLicense_key() {
		return license_key;
	}

	public void setLicense_key(String license_key) {
		this.license_key = license_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_description() {
		return client_description;
	}

	public void setClient_description(String client_description) {
		this.client_description = client_description;
	}
	
}
