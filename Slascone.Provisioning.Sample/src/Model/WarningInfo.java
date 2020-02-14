package Model;

public class WarningInfo {
	public int Id;
	
	public String message = null;
	
	public WarningInfo() {
		super();
	}

	public WarningInfo(int id, String message) {
		super();
		Id = id;
		this.message = message;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
