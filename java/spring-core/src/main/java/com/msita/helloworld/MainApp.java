package com.msita.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("helloworld_bean.xml");
        HelloWorldSetterDemo helloWorldSetterDemoObject = (HelloWorldSetterDemo)context.getBean("helloWorldSetterDemo");
        helloWorldSetterDemoObject.printMessage();

        HelloWorldConstructorDemo helloWorldConstructorDemo =(HelloWorldConstructorDemo)context.getBean("helloWorldConstructorDemo");
        helloWorldConstructorDemo.printMessage();
    }
}
