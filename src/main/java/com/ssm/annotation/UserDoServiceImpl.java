package com.ssm.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userDoService")
//相当于配置文件中的<bean id="userDoService" class="com.ssm.annotation.UserDoServiceImpl"/>
public class UserDoServiceImpl implements UserDoService{
    @Resource(name="userDo")
    //相当于配置文件中的<property name="userDo" ref="userDo"/>
    private UserDo userDo;

    public UserDo getUserDo() {
        return userDo;
    }

    public void setUserDo(UserDo userDo) {
        this.userDo = userDo;
    }
    public void say(){
        this.userDo.say();
        System.out.println("UserDoService.say().......");
    }
}
