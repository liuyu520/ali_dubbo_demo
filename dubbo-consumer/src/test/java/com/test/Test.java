package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println(demoService.sayHello("哈哈哈"));
        IWork work = (IWork) context.getBean("workService");
        System.out.println(work.work("黄威"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
