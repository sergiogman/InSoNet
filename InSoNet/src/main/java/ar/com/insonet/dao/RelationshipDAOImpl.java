package ar.com.insonet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.com.insonet.model.Relationship;

public class RelationshipDAOImpl implements RelationshipDAO {
	
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addRelationship(Relationship relationship) {
		getCurrentSession().save(relationship);
	}
	
	@Override
	public void updateRelationship(Relationship relationship) {
		Relationship relationshipToUpdate = getRelationship(relationship.getId());
		relationshipToUpdate.setName(relationship.getName());
		relationshipToUpdate.setEmail(relationship.getEmail());
		relationshipToUpdate.setPhone(relationship.getPhone());
		relationshipToUpdate.setAddress(relationship.getAddress());
		getCurrentSession().update(relationshipToUpdate);
	}
	
	@Override
	public Relationship getRelationship(int id) {
		Relationship relationship = (Relationship)getCurrentSession().get(Relationship.class, id);
		return relationship;
	}
	
	@Override
	public void deleteRelationship(int id) {
		Relationship relationship = getRelationship(id);
		if ( relationship != null)
		{
			getCurrentSession().delete(relationship);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Relationship> getAllRelationships() {
		return getCurrentSession().createQuery("from relationship").list();
	}

}