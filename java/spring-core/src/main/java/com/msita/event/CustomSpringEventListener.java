package com.msita.event;

import org.springframework.context.ApplicationListener;

public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {

    public void onApplicationEvent(CustomSpringEvent customSpringEvent) {
        System.out.println("Receive spring custom event: " + customSpringEvent.getMessage());
    }
}
