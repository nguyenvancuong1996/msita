package com.msita.configuration;

public class AnotherBean {

    private MyBean myBean;

    public AnotherBean(final MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(final MyBean myBean) {
        this.myBean = myBean;
    }
}
