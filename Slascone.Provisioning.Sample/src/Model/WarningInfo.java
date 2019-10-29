package Model;

public class WarningInfo {
	public int Id;
	
	public String ErrorMessage;

	public WarningInfo(int id, String errorMessage) {
		super();
		this.Id = id;
		this.ErrorMessage = errorMessage;
	}
	
	public WarningInfo() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.ErrorMessage = errorMessage;
	}
}
