package com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnClass;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name="com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnClass.RequiredClassForConditionalOnClass")
public class ConfigurationForConditionalOnClass {

	@Bean
	public SampleService sampleService() {
		return new SampleService();
	}
}
