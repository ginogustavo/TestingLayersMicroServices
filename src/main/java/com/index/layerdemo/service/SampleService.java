package com.index.layerdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.index.layerdemo.repository.SampleRepository;

@Service
public class SampleService {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	public SampleService(SampleRepository sampleRepository){
		this.sampleRepository = sampleRepository;
	}
	
	
	public String welcome(String username) {
		return sampleRepository.getMessageByUser(username);
	}
	
}
