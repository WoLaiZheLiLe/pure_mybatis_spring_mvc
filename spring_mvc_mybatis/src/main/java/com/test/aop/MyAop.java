package com.test.aop;

import java.math.BigDecimal;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import com.alibaba.fastjson.JSON;

@Order(2)
@Aspect
public class MyAop {
	@Pointcut("execution(public * com.test.aop.*.*(..))")
	public void match() {}
	
	@Before(value = "match()")
	public void before() {
		System.out.println("前置通知------before");
	}
	
	@Around(value = "match()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		System.out.println("环绕通知---before-around" + ", 参数:" + JSON.toJSONString(args));
		Object proceed = joinPoint.proceed(args);
		System.out.println("环绕通知---after-around");
		return proceed;
	}
	
	@AfterReturning(value = "match()", returning ="obj")
	public void aftetReturning(JoinPoint joinPoint, Object obj) {
		System.out.println("后置通知----afterReturning" + ", 返回值：" + obj);
	}
	
	@After(value = "match()")
	public void after() {
		System.out.println("回收----after");
	}
	
	@AfterThrowing(value = "match()", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("异常抛出：----afterThrowing" + e);
	}
	
	public static void main(String[] args) {
		System.out.println(new BigDecimal(0).compareTo(new BigDecimal(0)) <= 0);
	}
}
