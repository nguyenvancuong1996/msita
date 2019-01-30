package com.msita.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public MyBean myBean() {
        final MyBean myBean = new MyBean();
        myBean.setValue("DemoConfiguration value");
        return myBean;
    }

}
