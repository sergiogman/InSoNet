package ar.com.insonet.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;

public class FacebookService {

	public void signin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Facebook facebook = new FacebookFactory().getInstance();
		request.getSession().setAttribute("facebook", facebook);
		StringBuffer callbackURL = request.getRequestURL();
		int index = callbackURL.lastIndexOf("/");
		callbackURL.replace(index, callbackURL.length(), "").append("/callback");
		response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
	}
	
	public void callback(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
		String oauthCode = request.getParameter("code");
		try {
			facebook.getOAuthAccessToken(oauthCode);
		} catch (FacebookException e) {
			throw new ServletException(e);
		}
		response.sendRedirect(request.getContextPath() + "/");
	}
}
