package Model;

import java.util.UUID;

public class LicenseVariable {
	public UUID id = null;
	
	public String name = null;
	
	public String description = null;
	
	public String value = null;

	public LicenseVariable(UUID id, String name, String description, String value) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public LicenseVariable() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
