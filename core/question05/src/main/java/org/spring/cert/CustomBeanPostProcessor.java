package org.spring.cert;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("%s::postProcessBeforeInitialization %s %s",
                getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName));
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(String.format("%s::postProcessAfterInitialization %s %s",
                getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName));
        return null;
    }
}
