package com.test.lifestyle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class Chinese implements Person, InitializingBean {

	private Axe axe;
	
	private String name;
	

	public void setAxe(Axe axe) {
		this.axe = axe;
		System.out.println("依赖注入Axe");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("依赖注入name");
	}
	public Chinese() {
		System.out.println("构造Chinese");
	}
	@Override
	public void userAxe() {
		// TODO Auto-generated method stub
		System.out.println(this.name + ",使用斧子：" + axe.chop());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("正在执行初始化方法afterPropertiesSet来=-----Chinese实例");
	}
	
	@PostConstruct
	public void sayHello() {
		System.out.println("hello: " + this.name);
	}
	
	@PreDestroy
	public void sayBye() {
		System.out.println("bye: " + this.name);
	}

}
