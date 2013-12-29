package ar.com.insonet.dao;

import org.hibernate.Session;
import org.junit.Test;

import ar.com.insonet.model.InsonetUser;

public class TestUser {


	@Test
	public void testSaveInsonetUser() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();		
		String setUsername = "sersh";
		String setPassword="***";
		String setName="sergio";
		String setSurname="man";
		String setEmail="sergio";
		Integer setCelular=123;
		InsonetUser user = new InsonetUser(setUsername,setPassword,setName,setSurname,setEmail,setCelular);

		session.save(user);
		session.getTransaction().commit();
	}
}