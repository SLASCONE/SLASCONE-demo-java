package Model;

import java.util.UUID;

public class LicenseLimitation {
	public UUID id = null;
	
	public String name = null;
	
	public String description = null;
	
	public int value = 0;

	public LicenseLimitation(UUID id, String name, String description, int value) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
	}
	
	public LicenseLimitation() {
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
