package com.feign.demo.fallback;

import org.springframework.stereotype.Component;

import com.feign.demo.interfaces.IProvider;

@Component
public class ProviderFallback implements IProvider {

	@Override
	public String test() {
		return "test fallback";
	}
}
