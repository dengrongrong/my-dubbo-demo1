package com.dr.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("服务器启动了...");
        System.in.read();
    }
}
