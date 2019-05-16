package com.ssm.jdkproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
*使用jdk代理的对象，必须实现每个接口
* 且返回的代理对象，需要强制转换为接口对象
 */
public class Manger {
    public static void main(String[] args) {
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
