package com.index.layerdemo.mapper;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.index.layerdemo.service.SampleService;
import com.index.layerdemo.web.SampleController;

public class SampleControllerTest {

	private SampleController sampleController;
	private SampleService  sampleService;
	
	@Before
	public void init(){
		sampleService = mock(SampleService.class);
		sampleController = new SampleController(sampleService);
	}
	
	@Test
	public void sampleControllerShouldCallService() {
		String userName = "nroales";
		String expectedMessage = "message";
		System.out.println("Testing sampleControllerShouldCall service "+ userName + " - "+ expectedMessage);
		when(sampleService.welcome(userName)).thenReturn(expectedMessage);
		
		String message = sampleController.welcome(userName);
		verify(sampleService).welcome(userName);
		assertTrue(message.equals( expectedMessage ));
		
	}
	
	
	
}
