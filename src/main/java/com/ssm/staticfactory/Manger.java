package com.ssm.staticfactory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        bean test = (bean) context.getBean("bean");
        System.out.println(test.toString());
    }
}
