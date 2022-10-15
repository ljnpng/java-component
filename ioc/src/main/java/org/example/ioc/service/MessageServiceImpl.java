package org.example.ioc.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class MessageServiceImpl implements MessageService, ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public String getMessage() {
        System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(this.getClass())));
        return "hello world";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }
}
