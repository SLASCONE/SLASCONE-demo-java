package Model;

public class SessionInfo {

    public OpenSessionInfo OpenSessionInfo = null;
	
	public WarningInfo WarningInfo = null;

	
	public SessionInfo() {
		super();
	}

	public SessionInfo(Model.OpenSessionInfo openSessionInfo, Model.WarningInfo warningInfo) {
		super();
		OpenSessionInfo = openSessionInfo;
		WarningInfo = warningInfo;
	}

	public OpenSessionInfo getOpenSessionInfo() {
		return OpenSessionInfo;
	}

	public void setOpenSessionInfo(OpenSessionInfo openSessionInfo) {
		OpenSessionInfo = openSessionInfo;
	}

	public WarningInfo getWarningInfo() {
		return WarningInfo;
	}

	public void setWarningInfo(WarningInfo warningInfo) {
		WarningInfo = warningInfo;
	}

}
