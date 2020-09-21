package Model;

public class SessionInfo {

    public SessionViolationInfo SessionViolationInfo = null;
	
	public WarningInfo WarningInfo = null;

	
	public SessionInfo() {
		super();
	}

	public SessionInfo(Model.SessionViolationInfo sessionViolationInfo, Model.WarningInfo warningInfo) {
		super();
		SessionViolationInfo = sessionViolationInfo;
		WarningInfo = warningInfo;
	}

	public SessionViolationInfo getSessionViolationInfo() {
		return SessionViolationInfo;
	}

	public void setSessionViolationInfo(SessionViolationInfo sessionViolationInfo) {
		SessionViolationInfo = sessionViolationInfo;
	}

	public WarningInfo getWarningInfo() {
		return WarningInfo;
	}

	public void setWarningInfo(WarningInfo warningInfo) {
		WarningInfo = warningInfo;
	}

}
