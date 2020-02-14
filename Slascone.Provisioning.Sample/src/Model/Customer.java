package Model;

public class Customer {
	private String customer_id = null;
		
	private String company_name = null;
	
	private String customer_number = null;
	
	public Customer() {
		super();
	}

	public Customer(String customer_id, String company_name, String customer_number) {
		super();
		this.customer_id = customer_id;
		this.company_name = company_name;
		this.customer_number = customer_number;
	}	
	
	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}	
}
