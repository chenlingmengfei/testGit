package com.ssm.instance;

public class MyInstance {
    public MyInstance(){
        System.out.println("");
    }
    public Bean1 createBean(){
        return new Bean1();
    }
}
