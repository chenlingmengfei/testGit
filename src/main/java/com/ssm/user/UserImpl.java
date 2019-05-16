package com.ssm.user;

public class UserImpl implements User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("hello " + name);
    }
}
