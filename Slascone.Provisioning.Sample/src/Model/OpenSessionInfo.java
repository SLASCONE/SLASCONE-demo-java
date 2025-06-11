package Model;

import java.util.Date;

public class OpenSessionInfo {

	public Boolean is_session_valid = null;
	
	public Date session_valid_until = null; 
	
	public OpenSessionInfo() {
		super();
	}

	public OpenSessionInfo(Boolean is_session_valid, Date session_valid_until) {
		super();
		this.is_session_valid = is_session_valid;
		this.session_valid_until = session_valid_until;
	}

	public Boolean getIs_session_valid() {
		return is_session_valid;
	}

	public void setIs_session_valid(Boolean is_session_valid) {
		this.is_session_valid = is_session_valid;
	}

	public Date getSession_valid_until() {
		return session_valid_until;
	}

	public void setSession_valid_until(Date session_valid_until) {
		this.session_valid_until = session_valid_until;
	}

}
