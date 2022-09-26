package Model;

public class StringResultInfo {
	public String SuccessInfo = null;
	
	public WarningInfo WarningInfo = null;

	public StringResultInfo(String successInfo, Model.WarningInfo warningInfo) {
		super();
		SuccessInfo = successInfo;
		WarningInfo = warningInfo;
	}
	
	public StringResultInfo() {
		super();
	}

	public String getSuccessInfo() {
		return SuccessInfo;
	}

	public void setSuccessInfo(String successInfo) {
		SuccessInfo = successInfo;
	}

	public WarningInfo getWarningInfo() {
		return WarningInfo;
	}

	public void setWarningInfo(WarningInfo warningInfo) {
		WarningInfo = warningInfo;
	}
}
