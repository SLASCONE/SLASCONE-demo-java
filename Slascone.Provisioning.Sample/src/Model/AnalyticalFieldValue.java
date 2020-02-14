package Model;
import java.util.UUID;

public class AnalyticalFieldValue {
	private UUID analytical_field_id = null;

	private String value = null;
	
	public AnalyticalFieldValue() {
		super();
	}

	public AnalyticalFieldValue(UUID analytical_field_id, String value) {
		super();
		this.analytical_field_id = analytical_field_id;
		this.value = value;
	}

	public UUID getAnalytical_field_id() {
		return analytical_field_id;
	}

	public void setAnalytical_field_id(UUID analytical_field_id) {
		this.analytical_field_id = analytical_field_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
