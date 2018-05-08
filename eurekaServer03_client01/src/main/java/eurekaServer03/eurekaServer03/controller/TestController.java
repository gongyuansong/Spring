package eurekaServer03.eurekaServer03.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping(value="/provider_03_01/getTest", method=RequestMethod.GET)
	public String getUrl(HttpServletRequest request) {
		StringBuffer sb = new StringBuffer();
		sb.append("ip = " + request.getLocalAddr() + ",");
		sb.append("port = " + request.getLocalPort() + "");
		return sb.toString();
	}
}
