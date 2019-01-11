package com.msita.helloworld;

public class HelloWorldConstructorDemo {

    private String message;

    public HelloWorldConstructorDemo(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("The message is: " + message);
    }
}
