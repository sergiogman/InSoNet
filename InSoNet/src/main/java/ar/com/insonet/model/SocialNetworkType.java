package ar.com.insonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="socialNetworkType")
public class SocialNetworkType {
	
	@Id
	@GeneratedValue
	private int Id;
	private String SocialNetwork;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSocialNetwork() {
		return SocialNetwork;
	}
	public void setSocialNetwork(String socialNetwork) {
		SocialNetwork = socialNetwork;
	}
	
	
}