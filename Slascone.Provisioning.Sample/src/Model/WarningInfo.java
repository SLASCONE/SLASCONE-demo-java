package Model;

public class WarningInfo {
	public int id;
	
	public String message = null;
	
	public WarningInfo() {
		super();
	}

	public WarningInfo(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
