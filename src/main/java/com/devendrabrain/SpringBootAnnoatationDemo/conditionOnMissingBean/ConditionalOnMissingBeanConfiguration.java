package com.devendrabrain.SpringBootAnnoatationDemo.conditionOnMissingBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnMissingBeanConfiguration {

	@Bean
	@ConditionalOnMissingBean(name="thatBeanWhichIsNotAvailable")
	public SampleServiceConditionalOnMissingBean conditionalOnMissingBean() {
		
		return new SampleServiceConditionalOnMissingBean();
	}
	
}
