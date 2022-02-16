package com.devendrabrain.SpringBootAnnoatationDemo.ConditionalOnMissingClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalOnMissingClassController {

	@Autowired
	SampleServiceForMissingClass sampleServiceForMissingClass;
	
	@GetMapping("/conditionalOnMissingClass")
	public String conditionalOnClass() {
		return sampleServiceForMissingClass.sentOutput();
	}
}
