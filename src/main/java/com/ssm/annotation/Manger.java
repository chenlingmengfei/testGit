package com.ssm.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    public static void main(String[] args){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取实例
        UserDoController userController = (UserDoController) context.getBean("userDoController");
        userController.say();
    }
}
