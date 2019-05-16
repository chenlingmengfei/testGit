package com.ssm.cglibproxy;

import com.ssm.jdkproxy.UserManger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("proxyApplicationContext.xml");
        UserManger userManger = (UserManger) context.getBean("userManger");
        UserManger user = (UserManger) (new MyCglibProxy()).newProxy(userManger);
        user.addUser();
        user.deteleUser();
    }
}
