package com.test;

import org.springframework.stereotype.Service;

@Service
public class WorkHard implements IWork {
    @Override
    public String work(String name) {
        System.out.println("work hard:" + name);
        return name + " work hard.";
    }
}
