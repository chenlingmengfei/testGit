package com.ssm.assemble;

import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> live;

    public User(){

    }

    public User(String name,int age,List<String> live){
        this.name=name;
        this.age=age;
        this.live=live;
    }

    public List<String> getLive() {
        return live;
    }

    public void setLive(List<String> live) {
        this.live = live;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "name:"+this.name+"\nage:"+this.age+"\nlive:"+this.live;
    }
}
