package com.ssm.cglibproxy;

import com.ssm.jdkproxy.MyAspect;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

public class MyCglibProxy implements MethodInterceptor {
    private Object target;
    public Object newProxy(Object target){
        this.target = target;
        //创建代理工厂
        ProxyFactory proxy = new ProxyFactory();
        proxy.addAdvice(this);
        proxy.setTarget(this.target);
        return proxy.getProxy();
    }
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object ref=null;
        MyAspect aspect = new MyAspect();
        try{
            aspect.log();
            ref = methodInvocation.proceed();
        }catch(Exception e){
            e.printStackTrace();
        }
        return ref;
    }
}
