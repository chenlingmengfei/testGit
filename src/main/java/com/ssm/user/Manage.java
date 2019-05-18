package com.ssm.user;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manage {
    /*
    *传统测试
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserImpl user = (UserImpl) context.getBean("user");
        user.setName("陈琳");
        user.say();
    }
    @Test
    /*
    *使用junit测试,方法前加@Test注解
    * */
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserImpl user = (UserImpl) context.getBean("user");
        user.setName("陈琳");
        user.say();
        UserImpl user1 = (UserImpl) context.getBean("user");
        System.out.println("\n");
        System.out.println(user);
        System.out.println(user1);
    }
}
