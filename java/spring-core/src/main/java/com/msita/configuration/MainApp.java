package com.msita.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(final String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DemoConfiguration.class);
        context.register(DemoNameConfiguration.class);
        context.refresh();

        MyBean myBean1 = (MyBean)context.getBean("myBean");
        MyBean myBean2 = (MyBean)context.getBean("myBean2");

        System.out.println(myBean1.getValue());
        System.out.println(myBean2.getValue());


        context = new AnnotationConfigApplicationContext(DemoMoreFeaturesConfiguration.class);
        AnotherBean anotherBean = (AnotherBean)context.getBean("anotherBean");
        AnotherBean anotherBean2 = (AnotherBean)context.getBean("anotherBean2");
        System.out.println(anotherBean.getMyBean().getValue());
        System.out.println(anotherBean2.getMyBean().getValue());
        anotherBean2.setMyBean(myBean2);
        AnotherBean anotherBean3 = (AnotherBean)context.getBean("anotherBean2");
        System.out.println(anotherBean2.getMyBean().getValue());
        System.out.println(anotherBean3.getMyBean().getValue());

    }
}
