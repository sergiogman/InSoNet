package ar.com.insonet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOCIABLE_TABLE")
public class SociableImpl implements Sociable {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long Id;
}