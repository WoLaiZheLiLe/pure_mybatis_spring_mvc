package com.test.aop;

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

@Order(1)
@Aspect
public class MyAop2 {
	@Pointcut("execution(public * com.test.aop.*.*(..))")
	public void match() {}
	
	@Before(value = "match()")
	public void before() {
		System.out.println("前置通知2------before2");
	}
	
	@Around(value = "match()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		System.out.println("环绕通知2---before-around2" + ", 参数:" + JSON.toJSONString(args));
		Object proceed = joinPoint.proceed(args);
		System.out.println("环绕通知2---after-around2");
		return proceed;
	}
	
	@AfterReturning(value = "match()", returning ="obj")
	public void aftetReturning(JoinPoint joinPoint, Object obj) {
		System.out.println("后置通知2----afterReturning2" + ", 返回值：" + obj);
	}
	
	@After(value = "match()")
	public void after() {
		System.out.println("回收2----after");
	}
	
	@AfterThrowing(value = "match()", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("异常抛出2：----afterThrowing2" + e);
	}
}
