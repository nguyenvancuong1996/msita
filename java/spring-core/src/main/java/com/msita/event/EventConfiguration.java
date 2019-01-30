package com.msita.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfiguration {

    @Bean
    public CustomSpringEventPublisher customSpringEventPublisher() {
        return new CustomSpringEventPublisher();
    }

    @Bean
    public CustomSpringEventListener customSpringEventListener() {
        return new CustomSpringEventListener();
    }

}
