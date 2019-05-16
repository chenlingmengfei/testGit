package com.ssm.seter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductImpl product = (ProductImpl) context.getBean("product");
        product.printInformation();
    }
}
