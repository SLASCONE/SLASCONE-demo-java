package Model;

import java.util.List;

public class ConsumptionHeartbeatDto {
	public String client_id = null;
	
    public List<ConsumptionHeartbeatValueDto> consumption_heartbeat = null;

    public String token_key = null;
    
    public ConsumptionHeartbeatDto() {
    	super();
    }

	public ConsumptionHeartbeatDto(String client_id, List<ConsumptionHeartbeatValueDto> consumption_heartbeat,
			String token_key) {
		super();
		this.client_id = client_id;
		this.consumption_heartbeat = consumption_heartbeat;
		this.token_key = token_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public List<ConsumptionHeartbeatValueDto> getConsumption_heartbeat() {
		return consumption_heartbeat;
	}

	public void setConsumption_heartbeat(List<ConsumptionHeartbeatValueDto> consumption_heartbeat) {
		this.consumption_heartbeat = consumption_heartbeat;
	}

	public String getToken_key() {
		return token_key;
	}

	public void setToken_key(String token_key) {
		this.token_key = token_key;
	}
    
    
}
