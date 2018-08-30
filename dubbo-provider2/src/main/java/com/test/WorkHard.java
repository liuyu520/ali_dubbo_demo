package com.test;

import org.springframework.stereotype.Service;

@Service
public class WorkHard implements IWork {
    @Override
    public void work(String name) {
        System.out.println("work hard:" + name);
    }
}
