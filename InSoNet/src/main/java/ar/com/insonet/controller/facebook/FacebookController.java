package ar.com.insonet.controller.facebook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.com.insonet.service.FacebookService;

@Controller
public class FacebookController {
	
	@RequestMapping("/fblogin")
    public ModelAndView fbloginHandler() {

        ModelAndView mav = new ModelAndView();

        // Use the view named "home" to display the data
        mav.setViewName("fblogin");
        // Add a model object to be displayed by the view
        mav.addObject("message", "Facebook login");

        return mav;
    }
	
	@RequestMapping("/signin")
	public void signinHandler(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();

        // Use the view named "home" to display the data
        mav.setViewName("fblogin");
        // Add a model object to be displayed by the view
        mav.addObject("message", "Facebook login");
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("services.xml");
        FacebookService fbService = ctx.getBean(FacebookService.class);
        fbService.signin(request, response);
        
        //return mav;
	}
	
	@RequestMapping(value="/callback", params="code")
	public void callbackHandler(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();

        mav.setViewName("fblogin");
        // Add a model object to be displayed by the view
        mav.addObject("message", "Facebook login");
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("services.xml");
        FacebookService fbService = ctx.getBean(FacebookService.class);
        fbService.callback(request, response);
        
        //return mav;
	}
	

}
