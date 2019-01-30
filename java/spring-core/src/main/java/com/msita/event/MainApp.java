package com.msita.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfiguration.class);

        CustomSpringEventPublisher publisher =
                (CustomSpringEventPublisher) context.getBean("customSpringEventPublisher");
        publisher.pushlishAnEvent("My first message");
        System.out.println("Do something here");
        publisher.pushlishAnEvent("My second message");

        context = new AnnotationConfigApplicationContext();
        context.register(EventConfiguration.class);
        context.register(AsynchronousSpringEventsConfiguration.class);
        context.refresh();

        CustomSpringEventPublisher asyncPublisher =
                (CustomSpringEventPublisher) context.getBean("customSpringEventPublisher");
        asyncPublisher.pushlishAnEvent("My first async message");
        System.out.println("Do something here");
        asyncPublisher.pushlishAnEvent("My second async message");
    }

}
