package Model;

import java.util.List;

public class UsageHeartbeatDto {
	public String client_id = null;
	
    public List<UsageFeatureValueDto> usage_heartbeat = null;

    public String token_key = null;
    
    public UsageHeartbeatDto()
    {
    	super();
    }
    
	public UsageHeartbeatDto(String client_id, List<UsageFeatureValueDto> usage_heartbeat, String token_key) {
		super();
		this.client_id = client_id;
		this.usage_heartbeat = usage_heartbeat;
		this.token_key = token_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public List<UsageFeatureValueDto> getUsage_heartbeat() {
		return usage_heartbeat;
	}

	public void setUsage_heartbeat(List<UsageFeatureValueDto> usage_heartbeat) {
		this.usage_heartbeat = usage_heartbeat;
	}

	public String getToken_key() {
		return token_key;
	}

	public void setToken_key(String token_key) {
		this.token_key = token_key;
	}
    
    
}
