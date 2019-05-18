package com.ssm.initAnddestroy;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*测试bean的生命周期
 */
public class Manger {
    @Test
    public void demo(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man) context.getBean("man");
        man.say();
        //关闭工厂销毁实例
        context.close();
    }
}
