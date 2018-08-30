package com.test.main;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.test.DemoService;
import com.test.DemoServiceImpl;

import java.io.IOException;

public class ProviderServer {
    public static void main(String[] args) throws IOException {
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<DemoService>();
        ApplicationConfig applicationConfig = new ApplicationConfig("first-dubbo-provider");
        applicationConfig.setOwner("whuang");
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://119.23.220.89:2181"));
//        serviceConfig.setp
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(new DemoServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
