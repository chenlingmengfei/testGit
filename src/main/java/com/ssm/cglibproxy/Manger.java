package com.ssm.cglibproxy;

import com.ssm.jdkproxy.UserMangerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("proxyApplicationContext.xml");
        UserMangerImpl userManger = (UserMangerImpl) context.getBean("userManger");
        UserMangerImpl user = (UserMangerImpl) (new MyCglibProxy()).newProxy(userManger);
        user.addUser();
        user.deteleUser();
    }
}
