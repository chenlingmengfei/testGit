package com.ssm.seter;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) context.getBean("product");
        product.printInformation();
    }
}
