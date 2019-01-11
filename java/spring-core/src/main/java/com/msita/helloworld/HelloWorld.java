package com.msita.helloworld;

public class HelloWorld {
    private String message;

    public void printMessage() {
        System.out.println("The message is: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
