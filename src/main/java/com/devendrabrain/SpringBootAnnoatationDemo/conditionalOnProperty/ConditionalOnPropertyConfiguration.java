package com.devendrabrain.SpringBootAnnoatationDemo.conditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalOnPropertyConfiguration {
	
	@Bean
	@ConditionalOnProperty(prefix="that.property.which", name="exist",matchIfMissing=true,havingValue="Yes")
	public SampleServiceConditionalOnProperty sampleServiceConditionalOnProperty() {
		return new SampleServiceConditionalOnProperty();
	}
}
