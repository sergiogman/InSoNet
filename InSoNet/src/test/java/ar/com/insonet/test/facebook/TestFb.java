package ar.com.insonet.test.facebook;

import org.junit.Test;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;

public class TestFb {

	@Test
	public void Login() throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.getOAuthAccessToken("ss");
		System.out.println(facebook);
	}
}
