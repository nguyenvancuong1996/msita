package com.msita.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBeanName implements InitializingBean, DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBeanName After properties set");
    }

    public void destroy() throws Exception {
        System.out.println("MyBeanName Bean will destroy");
    }

    public void customInit() {
        System.out.println("MyBeanName customInit");
    }

    public void customDestroy() {
        System.out.println("MyBeanName customDestroy");
    }
}
