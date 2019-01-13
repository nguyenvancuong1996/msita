package com.msita.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes_bean.xml");
        // Singleton demo
        BeanScopesSingleton objSingletonA = (BeanScopesSingleton)applicationContext.getBean("beanScopesSingleton");
        objSingletonA.setMessage("I'm object A");
        objSingletonA.printMessage();

        BeanScopesSingleton objSingletonB = (BeanScopesSingleton)applicationContext.getBean("beanScopesSingleton");
        objSingletonB.printMessage();

        // Prototype demo
        BeanScopesPrototype objPrototypeA = (BeanScopesPrototype) applicationContext.getBean("beanScopesPrototype");
        objPrototypeA.setMessage("I'm object A");
        objPrototypeA.printMessage();

        BeanScopesPrototype objPrototypeB = (BeanScopesPrototype)applicationContext.getBean("beanScopesPrototype");
        objPrototypeB.printMessage();
    }
}
