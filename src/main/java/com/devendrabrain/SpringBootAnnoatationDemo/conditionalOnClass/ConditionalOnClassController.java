package com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalOnClassController {

	@Autowired
	SampleService sampleService;
	
	@GetMapping("/conditionalOnClass")
	public String conditionalOnClass() {
		return sampleService.sentOutput();
	}
}
