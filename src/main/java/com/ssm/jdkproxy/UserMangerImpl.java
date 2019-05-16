package com.ssm.jdkproxy;

import org.springframework.stereotype.Repository;

@Repository("userManger")
public class UserMangerImpl implements UserManger{
    public void addUser(){
        System.out.println("执行添加方法");
    }
    public void deteleUser(){
        System.out.println("执行删除方法");
    }
}
