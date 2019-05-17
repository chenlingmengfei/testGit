package com.ssm.collectionBean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CellectionBean bean= (CellectionBean) context.getBean("collectionBean");
        System.out.println(bean);
    }
}
