package com.dev.hello;

import com.dev.hello.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {
	@Autowired
	private HelloService helloService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {
		String expected = "Hello Tom Sawyer";
		String result = helloService.getFriend().greetFriend();
		Assertions.assertEquals(expected, result);
	}
}
