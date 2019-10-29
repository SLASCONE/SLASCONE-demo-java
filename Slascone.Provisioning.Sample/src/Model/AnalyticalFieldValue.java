package Model;
import java.util.UUID;

public class AnalyticalFieldValue {
	private UUID analyitcalFieldId = null;

	private String analyticalValue = null;

	public AnalyticalFieldValue(UUID analyitcalFieldId, String analyticalValue) {
		super();
		this.analyitcalFieldId = analyitcalFieldId;
		this.analyticalValue = analyticalValue;
	}
	
	public AnalyticalFieldValue() {
		super();
	}

	public UUID getAnalyitcalFieldId() {
		return analyitcalFieldId;
	}

	public void setAnalyitcalFieldId(UUID analyitcalFieldId) {
		this.analyitcalFieldId = analyitcalFieldId;
	}

	public String getAnalyticalValue() {
		return analyticalValue;
	}

	public void setAnalyticalValue(String analyticalValue) {
		this.analyticalValue = analyticalValue;
	}
}
