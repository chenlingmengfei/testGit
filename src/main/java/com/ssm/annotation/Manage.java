package com.ssm.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manage {
    @Test
    public void demo(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationApplication.xml");
        //获取实例
        UserDoController userController = (UserDoController) context.getBean("userDoController");
        userController.say();
    }
}
