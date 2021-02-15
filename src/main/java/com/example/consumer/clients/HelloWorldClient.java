package com.example.consumer.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableFeignClients
public class HelloWorldClient  {

    @Autowired
    HelloWorldFeign helloWorldFeign;

    public String helloWorld() {
        return helloWorldFeign.helloWorld();
    }

}

@FeignClient(name = "HelloWorld")
interface HelloWorldFeign {

    @GetMapping("/helloworld")
    public String helloWorld();
}