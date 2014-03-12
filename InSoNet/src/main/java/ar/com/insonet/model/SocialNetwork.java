package ar.com.insonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="socialNetwork")
public class SocialNetwork {
	@Id
	@GeneratedValue
	private Integer id;
	private Long idType;
	private String usernameSocial;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getIdType() {
		return idType;
	}
	public void setIdType(Long idType) {
		this.idType = idType;
	}
	public String getUsernameSocial() {
		return usernameSocial;
	}
	public void setUsernameSocial(String usernameSocial) {
		this.usernameSocial = usernameSocial;
	}
	
	
}