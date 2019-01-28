package com.msita.annotation;

import org.springframework.beans.factory.annotation.Required;

public class SomeBean {

    private String value;

    @Required
    public void setValue(String value) {
        this.value = value;
    }

    void printValue() {
        System.out.println("Value: " + value);
    }
}
