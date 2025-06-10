package Model;

public class WarningInfo {
	public int id;
	
	public String message = null;
	
	public String help = null;
	
	public WarningInfo() {
		super();
	}

	public WarningInfo(int id, String message, String help) {
		super();
		this.id = id;
		this.message = message;
		this.help = help;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
