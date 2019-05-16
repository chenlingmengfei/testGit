package com.ssm.jdkproxy;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
*使用jdk代理的对象，必须实现每个接口
 */
public class Manger {
    @Test
    public void demo() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("proxyApplicationContext.xml");
        //获取bean
        UserMangerImpl usermanger = (UserMangerImpl) context.getBean("userManger");
        //创建代理
        MyProxy proxy = new MyProxy();
        //返回代理后的接口对象
        UserManger user =(UserManger) (proxy.getProxy(usermanger));
        user.addUser();
        user.deteleUser();
    }
}
