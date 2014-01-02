package ar.com.insonet.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "user")
@DiscriminatorValue("2")
public class InsonetUser extends User {
	private String name;
	private String surname;
	private String email;
	private Integer celular;
	private Collection<Sociable> socialNetwork;
	private List<Configuration> personalConfiguration = new ArrayList<Configuration>();

	public InsonetUser() {
		super();
	}

	public InsonetUser(String username, String password, String name,
			String surname, String email, Integer celular) {
		super(username, password);
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.celular = celular;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
	public List<Sociable> getSocialNetwork() {
		List<Sociable> list = new ArrayList<>(this.socialNetwork);
		return list;
	}
	
	public void setSocialNetwork(Sociable sociable) {
		this.socialNetwork.add(sociable);
	}
	
	public List<Configuration> getPersonalConfiguration() {
		return this.personalConfiguration;
	}
	
	public void setPersonalConfiguration(Configuration configuration) {
		this.personalConfiguration.add(configuration);
	}

}
