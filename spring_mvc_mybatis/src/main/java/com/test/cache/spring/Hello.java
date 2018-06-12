package com.test.cache.spring;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	
	@Cacheable(value = "user")
	public char getName(Integer key) {
		String arr = "abcdefg";
		return arr.charAt(key);
	}
	
	@CachePut(value = "user", key = "#key")
	public char setName(Integer key, char value) {
		return  value;
	}
}
