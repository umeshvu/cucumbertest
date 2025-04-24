package com.uu.cucumbertest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GarCallConfig {

    @Value("${isAllowed:true}") // default is true
    private boolean isAllowed;

    @Bean
    public GarCall garCallBean() {
        if (isAllowed) {
            return new DefaultGarCall();
        } else {
            return new DemoGarCall();
        }
    }
}

