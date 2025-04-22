package com.example.sfg_di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware
        , BeanFactoryAware,ApplicationContextAware {

    public LifeCycleBeanDemo(){
        System.out.println("LifeCycleBeanDemo >> Constructor");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleBeanDemo >> setBeanFactory : " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LifeCycleBeanDemo >> setBeanName : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBeanDemo >> Destroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBeanDemo >> After properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleBeanDemo >> setApplicationContext " + applicationContext.toString());
    }

    public void beforeInit(){
        System.out.println("LifeCycleBeanDemo >> beforeInit ");
    }

    public void afterInit(){
        System.out.println("LifeCycleBeanDemo >> afterInit");
    }
}
