package com.dev.hello;

import com.dev.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {

	@Autowired
	HelloService helloService;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//System.out.println("Hello World From SpringBoot");
		System.out.println(helloService.getFriend().greetFriend());
	}
}
