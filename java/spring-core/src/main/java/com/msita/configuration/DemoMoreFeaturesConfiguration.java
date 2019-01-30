package com.msita.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DemoConfiguration.class)
public class DemoMoreFeaturesConfiguration {

    @Autowired
    @Qualifier("myBean")
    private MyBean bean;

    @Bean
    public MyBean myBean3() {
        final MyBean myBean = new MyBean();
        myBean.setValue("DemoMoreFeaturesConfiguration value");
        return myBean;
    }

    @Bean
    public AnotherBean anotherBean() {
        return new AnotherBean(bean);
    }

    @Bean
    @Scope("prototype")
    AnotherBean anotherBean2() {
        return new AnotherBean(myBean3());
    }
}
