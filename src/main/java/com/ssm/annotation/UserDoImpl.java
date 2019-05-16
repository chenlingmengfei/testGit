package com.ssm.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDo")
//@Repository("userDo")相当于<bean id="userDo" class="com.ssm.annotation.UserDoImpl"/>
public class UserDoImpl implements UserDo {
    public void say(){
        System.out.println("UserDoImpl.say()........");
    }
}
