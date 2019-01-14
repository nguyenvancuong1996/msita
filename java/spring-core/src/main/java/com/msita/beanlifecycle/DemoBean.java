package com.msita.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoBean {
    @PostConstruct
    public void customInit() {
        System.out.println("DemoBean customInit");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("DemoBean customDestroy");
    }
}
