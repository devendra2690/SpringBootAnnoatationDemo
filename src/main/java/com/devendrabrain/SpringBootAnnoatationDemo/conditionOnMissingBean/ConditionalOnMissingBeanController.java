package com.devendrabrain.SpringBootAnnoatationDemo.conditionOnMissingBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionalOnMissingBeanController {

	@Autowired
	SampleServiceConditionalOnMissingBean sampleServiceConditionalOnBean;
	
	@GetMapping("/conditionalOnMissingBean")
	public String conditionalOnBean() {
		return sampleServiceConditionalOnBean.getOP();
	}
}
