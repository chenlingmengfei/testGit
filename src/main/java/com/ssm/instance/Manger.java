package com.ssm.instance;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 test = (Bean1) context.getBean("mybean");
        System.out.println(test.toString());
    }
}
