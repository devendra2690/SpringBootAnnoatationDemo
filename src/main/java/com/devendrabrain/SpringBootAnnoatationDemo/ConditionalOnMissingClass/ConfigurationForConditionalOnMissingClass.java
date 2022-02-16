package com.devendrabrain.SpringBootAnnoatationDemo.ConditionalOnMissingClass;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass(value="com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnClass.MissingClassWhichIsNotOnClassPath")
public class ConfigurationForConditionalOnMissingClass {

	@Bean
	public SampleServiceForMissingClass sampleServiceForMissingClass() {
		return new SampleServiceForMissingClass();
	}
}
