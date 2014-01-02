package ar.com.insonet.model;

public class Configuration {
	private String parameter;
	private int userInsonetId;
	private String value;
	
	public String getParameter() {
		return this.parameter;
	}
	
	public void setParameter(String parameter) {
		
		this.parameter = parameter;
	}

	public int getUserInsonetId() {
		return userInsonetId;
	}

	public void setUserInsonetId(int userInsonetId) {
		this.userInsonetId = userInsonetId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}