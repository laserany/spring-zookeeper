package com.example.provider;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class ProviderController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
