package com.fj;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class Result {
	
	private String code;
	private Boolean isSuccess;
	private String errMsg;
	
	public Result() {
		super();
	}
	
	public Result(String code, Boolean isSuccess, String errMsg) {
		super();
		this.code = code;
		this.isSuccess = isSuccess;
		this.errMsg = errMsg;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		List<String> b = new ArrayList<String>();
		b.add("5");
		b.add("6");
		b.add("7");
		b.add("1");
		b.add("1");
		System.out.println(CollectionUtils.subtract(a, b));
	}
	
	
}
