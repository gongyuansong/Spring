package ribbon01.ribbon01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class RibbonConfiguration {
	
	@Bean
	 public IRule ribbonRule() {
		
        // return new AvailabilityFilteringRule();  
        return new RandomRule();//  
       // return new BestAvailableRule();  
       // return new RoundRobinRule();//轮询  
       // return new WeightedResponseTimeRule();  
       // return new RetryRule();  
       // return new ZoneAvoidanceRule();  
	}
}
