package com.example.consumer;

import com.example.consumer.clients.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloWorldClient helloWorldClient;

    @GetMapping("/get-hello")
    public String hello() {
        return helloWorldClient.helloWorld();
    }

}
