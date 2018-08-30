package com.test.main;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.test.DemoService;

public class ConsumerClient {
    public static void main(String[] args) {
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<DemoService>();
        referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://119.23.220.89:2181"));
        referenceConfig.setInterface(DemoService.class);
        DemoService greetingService = referenceConfig.get();
        System.out.println(greetingService.sayHello("world"));
    }
}
