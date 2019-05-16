package com.ssm.jdkproxy;

import org.springframework.stereotype.Repository;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Repository("myproxy")
public class MyProxy implements InvocationHandler {
    public Object target;
    public Object getProxy(Object target){
        this.target = target;
        //开启类处理器
        ClassLoader classloader = target.getClass().getClassLoader();
        //获取所有接口
        Class<?>[] c = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classloader,c,this);
    }
    /**
     * jdkproxy        带来对象本身
     * method       被拦截到的方法
     * args          方法的参数
     * methodProxy  方法的代理对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect aspect = new MyAspect();
        Object ret = null;
        try{
            //添加日志
            aspect.log();
            ret = method.invoke(this.target,args);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
