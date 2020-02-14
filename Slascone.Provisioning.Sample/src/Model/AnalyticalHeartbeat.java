package Model;

import java.util.List;

public class AnalyticalHeartbeat {
	private String client_id = null;

	private List<AnalyticalFieldValue> analytical_heartbeat = null;
	
	private String token_key = null;
	
	public AnalyticalHeartbeat() {
		super();
	}

	public AnalyticalHeartbeat(String client_id, List<AnalyticalFieldValue> analytical_heartbeat, String token_key) {
		super();
		this.client_id = client_id;
		this.analytical_heartbeat = analytical_heartbeat;
		this.token_key = token_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public List<AnalyticalFieldValue> getAnalytical_heartbeat() {
		return analytical_heartbeat;
	}

	public void setAnalytical_heartbeat(List<AnalyticalFieldValue> analytical_heartbeat) {
		this.analytical_heartbeat = analytical_heartbeat;
	}

	public String getToken_key() {
		return token_key;
	}

	public void setToken_key(String token_key) {
		this.token_key = token_key;
	}
}
