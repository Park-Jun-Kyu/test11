package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	
	@Pointcut("within(com.javalec.ex.*)")
	public void pointcutMethod() {
		
	}
	
	
	@Before("pointcutMethod()")
	public void beforeAdvice() {
		System.out.println("(before)시작시간 :"+System.currentTimeMillis());
	}
	@After("pointcutMethod()")
	public void afterAdvice() {
		System.out.println("(after)종료 시간 :"+System.currentTimeMillis());
		
	}
	
	
	public Object loggerAop(ProceedingJoinPoint joinpoint)throws Throwable{
		
		System.out.println("(around)시작 시간 :"+System.currentTimeMillis());
		
		try {
			return joinpoint.proceed();
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println("(around) 종료 시간 :"+System.currentTimeMillis());
		}
		
	}
	
	
	
}
