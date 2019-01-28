package com.msita.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection_bean.xml");
        ListCollectionDemo listCollectionDemo = (ListCollectionDemo) context.getBean("listCollectionDemo");
        SetCollectionDemo setCollectionDemo = (SetCollectionDemo) context.getBean("setCollectionDemo");
        MapCollectionDemo mapCollectionDemo = (MapCollectionDemo) context.getBean("mapCollectionDemo");

        System.out.println(listCollectionDemo.getAddresses().toString());
        System.out.println(setCollectionDemo.getAddresses().toString());
        System.out.println(mapCollectionDemo.getAddresses().toString());
    }
}
