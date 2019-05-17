package com.ssm.DataOperating;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manger {
    @Test
    public void demo(){
       //加载配置文件
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
       //获取Bean
       OperatingData operatingData = (OperatingData) context.getBean("dataOperating");
       //执行方法
       operatingData.updata();
       operatingData.detele();
       operatingData.save();
       operatingData.findAll();
    }
}
