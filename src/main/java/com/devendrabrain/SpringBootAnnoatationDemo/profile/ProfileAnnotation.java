package com.devendrabrain.SpringBootAnnoatationDemo.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Dev")
public class ProfileAnnotation {

	// All bean and configuration from this class will be loaded only when spring.active =  Dev
}
