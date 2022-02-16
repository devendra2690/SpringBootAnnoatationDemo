package com.devendrabrain.SpringBootAnnoatationDemo.conditionOnBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalOnBeanController {

	@Autowired
	SampleServiceConditionalOnBean sampleServiceConditionalOnBean;
	
	@GetMapping("/conditionalOnBean")
	public String conditionalOnBean() {
		return sampleServiceConditionalOnBean.getOP();
	}
}
