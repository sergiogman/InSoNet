package ar.com.insonet.dao;

import org.hibernate.Session;
import org.junit.Test;

import ar.com.insonet.model.InsonetUser;

public class TestUser {

	@Test
	public void testSaveInsonetUser() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();		
		String setUsername = "rodo";
		String setPassword = "";
		String setName = "rodolfo";
		String setSurname = "inturias";
		String setEmail = "inturias_r@yahoo.com.ar";
		Integer setCelular = 1558905890;
		InsonetUser user = new InsonetUser(setUsername,setPassword,setName,setSurname,setEmail,setCelular);

		session.save(user);
		session.getTransaction().commit();
	}
}