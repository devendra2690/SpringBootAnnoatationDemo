package com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalOnPropertyController {

	@Autowired
	SampleServiceConditionalOnProperty sampleServiceOnConditionalProperty;
	
	@GetMapping("/conditionalOnProperty")
	public String conditionalOnProperty() {
		return sampleServiceOnConditionalProperty.getOP();
	}
}
