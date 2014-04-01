package ar.com.insonet.test;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.com.insonet.controller.home.HomeController;

import junit.framework.TestCase;

public class HomeControllerTests extends TestCase {

	@Test
    public void testHelloHandlerView() throws Exception{
        HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.homeHandler();
        assertEquals("home", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        //Map modelMap = (Map)modelAndView.getModel().get("message");
        String strValue = (String) modelAndView.getModel().get("message");
        assertNotNull(strValue);
        assertEquals(strValue, "Bienvenido a InSoNet");
    }
}