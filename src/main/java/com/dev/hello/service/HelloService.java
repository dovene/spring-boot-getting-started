package com.dev.hello.service;

import com.dev.hello.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public HelloWorld getFriend(){
        return new HelloWorld("Tom Sawyer");
    }

}
