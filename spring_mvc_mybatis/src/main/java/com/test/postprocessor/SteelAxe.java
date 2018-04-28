package com.test.postprocessor;

import org.springframework.beans.factory.InitializingBean;

public class SteelAxe implements Axe, InitializingBean {

	@Override
	public String chop() {
		return "钢斧快";
	}
	
	public SteelAxe() {
		System.out.println("构造 SteelAxe");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("初始化 SteelAxe");
	}
	

}
