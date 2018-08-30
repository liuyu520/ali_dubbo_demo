package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc2.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();    // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
