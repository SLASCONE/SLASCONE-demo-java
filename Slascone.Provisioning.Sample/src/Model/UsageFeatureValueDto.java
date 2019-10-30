package Model;

import java.util.UUID;

public class UsageFeatureValueDto {
	public UUID UsageFeatureId = null;
	
    public String Value = null;

    public UsageFeatureValueDto() {
		super();
	}
    
	public UsageFeatureValueDto(UUID usageFeatureId, String value) {
		super();
		UsageFeatureId = usageFeatureId;
		Value = value;
	}

	public UUID getUsageFeatureId() {
		return UsageFeatureId;
	}

	public void setUsageFeatureId(UUID usageFeatureId) {
		UsageFeatureId = usageFeatureId;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	} 
}
