package com.test.aop;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HellowWorld {
	
	public void say(String content) {
		System.out.println("\t\t\t" + "世界好！！！, " + content);
	}
}
