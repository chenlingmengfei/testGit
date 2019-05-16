package com.ssm.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserImpl user = (UserImpl) context.getBean("user");
        user.setName("陈琳");
        user.say();
    }
}
