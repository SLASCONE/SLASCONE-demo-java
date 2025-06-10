package Model;

import java.util.UUID;

public class ValidateConsumptionStatusDto {
	public String client_id;
	
	public UUID limitation_id = null;
	
	public ValidateConsumptionStatusDto() {
		super();
	}

	public ValidateConsumptionStatusDto(String client_id, UUID limitation_id) {
		super();
		this.client_id = client_id;
		this.limitation_id = limitation_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public UUID getLimitation_id() {
		return limitation_id;
	}

	public void setLimitation_id(UUID limitation_id) {
		this.limitation_id = limitation_id;
	}
}
