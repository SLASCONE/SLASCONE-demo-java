package Model;

public class Customer {
	private String CustomerId = null;
	
	private String IsvId = null; 
	
	private String CompanyName = null;
	
	private String CustomerNumber = null;
	
	public Customer(String customerId, String isvId, String companyName, String customerNumber) {
		super();
		CustomerId = customerId;
		IsvId = isvId;
		CompanyName = companyName;
		CustomerNumber = customerNumber;
	}

	public Customer() {
		super();
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getIsvId() {
		return IsvId;
	}

	public void setCustomerNumber(String customerNumber) {
		this.CustomerNumber = customerNumber;
	}
	
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	
	public void setIsvId(String isvId) {
		IsvId = isvId;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	
}
