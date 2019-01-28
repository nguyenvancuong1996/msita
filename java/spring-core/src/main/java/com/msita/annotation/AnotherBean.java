package com.msita.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnotherBean {

    @Autowired
    @Qualifier("someBean")
    private SomeBean someBean;

    public SomeBean getSomeBean() {
        return someBean;
    }
}
