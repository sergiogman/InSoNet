package ar.com.insonet.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	// Processing request http://domain.com/context/hello
    @RequestMapping("/home")
    public ModelAndView homeHandler() {

        ModelAndView mav = new ModelAndView();

        // Use the view named "home" to display the data
        mav.setViewName("home");
        // Add a model object to be displayed by the view
        mav.addObject("message", "Bienvenido a InSoNet");

        return mav;
    }

}
