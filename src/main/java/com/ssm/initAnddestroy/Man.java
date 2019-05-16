package com.ssm.initAnddestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean , DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二步：设置属性");
        this.name = name;
    }

    public Man(){
        System.out.println("第一步：实例对象");
    }
    public void init(){
        System.out.println("第七步：初始化实例");
    }
    public void close(){
        System.out.println("第十一步：自定义销毁方法");
    }
    public void say(){
        System.out.println("第九步：执行自身的业务方法");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置Bean的名称"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行spring的销毁方法");
    }
}
