package ar.com.insonet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.com.insonet.model.InsonetUser;

@Repository
public class InsonetUserDAOImpl implements InsonetUserDAO {

	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addInsonetUser(InsonetUser insonetUser) {
		getCurrentSession().save(insonetUser);
	}

	public void updateInsonetUser(InsonetUser insonetUser) {
		InsonetUser insonetUserToUpdate = getInsonetUser(insonetUser.getId());
		insonetUserToUpdate.setUsername(insonetUser.getUsername());
		insonetUserToUpdate.setPassword(insonetUser.getPassword());
		getCurrentSession().update(insonetUserToUpdate);
	}

	public InsonetUser getInsonetUser(int id) {
		InsonetUser insonetUser = (InsonetUser) getCurrentSession().get(
				InsonetUser.class, id);
		return insonetUser;
	}

	public void deleteInsonetUser(int id) {
		InsonetUser insonetUser = getInsonetUser(id);
		if (insonetUser != null)
			getCurrentSession().delete(insonetUser);
	}

	@SuppressWarnings("unchecked")
	public List<InsonetUser> getInsonetUsers() {
		return getCurrentSession().createQuery("from insonetuser").list();
	}

}
