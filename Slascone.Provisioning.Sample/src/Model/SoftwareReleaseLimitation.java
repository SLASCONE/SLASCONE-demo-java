package Model;

import java.util.UUID;

public class SoftwareReleaseLimitation {
	public UUID id = null;

    public UUID productId = null;

    public String softwareRelease = null;
     
    public String description = null;

	public SoftwareReleaseLimitation(UUID id, UUID productId, String softwareRelease, String description) {
		super();
		this.id = id;
		this.productId = productId;
		this.softwareRelease = softwareRelease;
		this.description = description;
	}
	
	public SoftwareReleaseLimitation() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public String getSoftwareRelease() {
		return softwareRelease;
	}

	public void setSoftwareRelease(String softwareRelease) {
		this.softwareRelease = softwareRelease;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
