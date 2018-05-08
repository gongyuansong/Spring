package ribbon01.ribbon01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "errorFallBack")
	public String getTest() {
		return restTemplate.getForEntity("http://CLIENT01/provider_03_01/getTest", String.class).getBody();
	}
	
	public String errorFallBack(){
		return "request fail";
	}
}