package ar.com.insonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="configuration")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Configuration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long Id;
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