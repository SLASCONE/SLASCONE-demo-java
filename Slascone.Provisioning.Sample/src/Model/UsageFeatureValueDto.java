package Model;

import java.util.UUID;

public class UsageFeatureValueDto {
	public UUID usage_feature_id = null;
	
	public UUID usage_module_id = null;
	
    public double value;
    
    public UsageFeatureValueDto() {
    	super();
    }

	public UsageFeatureValueDto(UUID usage_feature_id, UUID usage_module_id, double value) {
		super();
		this.usage_feature_id = usage_feature_id;
		this.usage_module_id = usage_module_id;
		this.value = value;
	}

	public UUID getUsage_feature_id() {
		return usage_feature_id;
	}

	public void setUsage_feature_id(UUID usage_feature_id) {
		this.usage_feature_id = usage_feature_id;
	}

	public UUID getUsage_module_id() {
		return usage_module_id;
	}

	public void setUsage_module_id(UUID usage_module_id) {
		this.usage_module_id = usage_module_id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
    
    

}
