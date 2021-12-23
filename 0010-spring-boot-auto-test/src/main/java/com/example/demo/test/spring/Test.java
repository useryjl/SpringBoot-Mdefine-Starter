package com.example.demo.test.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author yjl
 * @Description
 * @create 2021-12-22
 */
@Configuration
public class Test implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory processor) throws BeansException {
        int count = processor.getBeanDefinitionCount();
        System.out.println(count);
    }
}
