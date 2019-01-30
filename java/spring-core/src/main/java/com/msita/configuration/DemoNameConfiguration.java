package com.msita.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoNameConfiguration {

    @Bean(name = "myBean2")
    MyBean myBean() {
        final MyBean myBean = new MyBean();
        myBean.setValue("DemoNameConfiguration value");
        return myBean;
    }
}
