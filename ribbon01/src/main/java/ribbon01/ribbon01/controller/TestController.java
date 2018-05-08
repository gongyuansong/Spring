package ribbon01.ribbon01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ribbon01.ribbon01.service.TestService;

@RestController
//@RibbonClient(name="CLIENT01", configuration = RibbonConfiguration.class)
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/ribbon/customer",method=RequestMethod.GET)
	public String getTest() {
        return testService.getTest();  
	}
}
