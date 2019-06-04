package com.dr.consumer;

import com.dr.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        DemoService service=context.getBean(DemoService.class);
        System.out.println("开始调用了...");
        String hello=service.hello("dengrong");
        System.out.println(hello);
    }

}
