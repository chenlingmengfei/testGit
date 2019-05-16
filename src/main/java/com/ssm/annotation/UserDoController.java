package com.ssm.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userDoController")
//相当于配置文件中的<bean id="userDoController" class="com.ssm.annotation.UserDoController"/>
public class UserDoController {
    @Resource(name="userDoService")
    //相当于配置文件中的<property name="userDoService" ref="userDoservice"/>
    private UserDoServiceImpl userDoService;

    public UserDoServiceImpl getUserDoService() {
        return userDoService;
    }

    public void setUserDoService(UserDoServiceImpl userDoService) {
        this.userDoService = userDoService;
    }
    public void say(){
        this.userDoService.say();
        System.out.println("UserDoController.say().....");
    }
}
