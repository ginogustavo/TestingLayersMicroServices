package com.index.layerdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.index.layerdemo.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	public SampleController(SampleService sampleService){
		this.sampleService = sampleService;	
	}


	@RequestMapping(value = "/welcome/{user}", method = RequestMethod.GET)
	public String welcome(@PathVariable("user") String userName) {
		System.out.println("Calling welcome controller> "+  userName);
		return sampleService.welcome(userName);
	}
	
}
