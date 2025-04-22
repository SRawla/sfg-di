package com.example.sfg_di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBeanDemo)
            ((LifeCycleBeanDemo)bean).beforeInit();
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBeanDemo)
            ((LifeCycleBeanDemo)bean).afterInit();
        return bean;
    }


}
