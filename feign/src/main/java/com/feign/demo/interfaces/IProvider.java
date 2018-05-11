package com.feign.demo.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feign.demo.config.ProviderConfigration;
import com.feign.demo.fallback.ProviderFallback;

//注解的意思是：负载均衡集群市provider,回滚类是这个class， 这个feignclient对应的配置文件是ProviderConfigration（这里设置了随机的规则，默认是轮询规则）
@FeignClient(value="provider", fallback=ProviderFallback.class, configuration=ProviderConfigration.class)
public interface IProvider {
	@RequestMapping(value = "/provider/getTest", method = RequestMethod.GET) 
	public String test();
}