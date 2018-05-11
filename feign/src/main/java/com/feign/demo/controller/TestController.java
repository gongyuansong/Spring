package com.feign.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feign.demo.interfaces.IProvider;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestController {

	@Autowired
	private IProvider provider;
	
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return provider.test();
	}
	
}
