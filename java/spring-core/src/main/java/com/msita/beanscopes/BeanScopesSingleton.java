package com.msita.beanscopes;

public class BeanScopesSingleton {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println("Your message: " + message);
    }
}
