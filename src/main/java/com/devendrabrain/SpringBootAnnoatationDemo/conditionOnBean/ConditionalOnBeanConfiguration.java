package com.devendrabrain.SpringBootAnnoatationDemo.conditionOnBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnBeanConfiguration {

	@Bean
	public ThatBeenWhichIsAvailable available() {
		
		return new ThatBeenWhichIsAvailable();
	}
	
	@Bean
	@ConditionalOnBean(name="available")
	public SampleServiceConditionalOnBean conditionalOnBean() {
		
		return new SampleServiceConditionalOnBean();
	}
	
}
