package com.ssm.DataOperating;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DataBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        Object proxy = null;
        if("dataOperating".equals(beanName)){
            proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(),bean.getClass().getInterfaces(),new InvocationHandler(){

                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if("save".equals(method.getName())){
                        System.out.println("权限校验....");
                        return  method.invoke(bean,args);
                    }
                    return method.invoke(bean,args);
                }
            });
        }
        return proxy;
    }
}
