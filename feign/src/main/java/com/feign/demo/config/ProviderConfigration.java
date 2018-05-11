package com.feign.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ProviderConfigration {
	
	@Bean
	 public IRule Rule() {
       // return new AvailabilityFilteringRule();  
       return new RandomRule();//  
      // return new BestAvailableRule();  
      // return new RoundRobinRule();//轮询  
      // return new WeightedResponseTimeRule();  
      // return new RetryRule();  
      // return new ZoneAvoidanceRule();  
	}
}
