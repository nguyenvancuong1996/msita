package com.msita.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beanlifecycle_bean.xml");
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
