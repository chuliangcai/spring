package com.bashir.spring.proecessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CustomBeanPostBeanProcessor implements BeanPostProcessor, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("before init:" + beanName);
        return null;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("my name is" + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getClass().toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after init:" + beanName);
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("i will destroy");
    }

    //    @Init
    @PostConstruct
    public void ssss() {
        System.out.println("ddd");
    }

    @PreDestroy
    public void sss() {
        System.out.println("ddd");

    }


}
