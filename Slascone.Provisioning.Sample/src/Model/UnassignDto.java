package Model;

public class UnassignDto {
	public String token_key = null;

	public UnassignDto() {
		super();
	}
	
	public UnassignDto(String token_key) {
		super();
		this.token_key = token_key;
	}

	public String getToken_key() {
		return token_key;
	}

	public void setToken_key(String token_key) {
		this.token_key = token_key;
	}
}
