package Model;

import java.util.UUID;

public class LicenseFeature {
	public UUID id = null;
	
	public String name = null;
	public String description = null;
	public Boolean is_active = null;
	
	public LicenseFeature() {
		super();
	}

	public LicenseFeature(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
