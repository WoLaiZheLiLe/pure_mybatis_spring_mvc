package com.fj;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		for (int i = 0; i < 79; i++) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		}
	}
	
}
