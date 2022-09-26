package Model;

import java.util.Date;
import java.util.UUID;

public class ConsumptionHeartbeatValueDto {
	public UUID limitation_id = null;
	
	public Date timestamp_utc = null;
	
	public double value;
	
	public ConsumptionHeartbeatValueDto() {
		super();
	}
	
    public ConsumptionHeartbeatValueDto(UUID limitation_id, Date timestamp_utc, double value) {
		super();
		this.limitation_id = limitation_id;
		this.timestamp_utc = timestamp_utc;
		this.value = value;
	}

	public UUID getLimitation_id() {
		return limitation_id;
	}

	public void setLimitation_id(UUID limitation_id) {
		this.limitation_id = limitation_id;
	}

	public Date getTimestamp_utc() {
		return timestamp_utc;
	}

	public void setTimestamp_utc(Date timestamp_utc) {
		this.timestamp_utc = timestamp_utc;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
