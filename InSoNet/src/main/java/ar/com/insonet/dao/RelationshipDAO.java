package ar.com.insonet.dao;

import java.util.List;

import ar.com.insonet.model.Relationship;

public interface RelationshipDAO {
	
	public void addRelationship(Relationship relationship);
	public void updateRelationship(Relationship relationship);
	public Relationship getRelationship(int id);
	public void deleteRelationship(int id);
	public List<Relationship> getAllRelationships();

}