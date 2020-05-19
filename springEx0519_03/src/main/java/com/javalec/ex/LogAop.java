package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {
		
	}
	
	@Around("within(com.javalec.ex.*)")
	public Object loggerAop(ProceedingJoinPoint joinpoint)throws Throwable{
		
		System.out.println("(around)시작시간 : "+System.currentTimeMillis());
		

		try {
			return joinpoint.proceed();
			
		} finally {
			System.out.println("(around)종료시간 :" + System.currentTimeMillis());
		}
		
		
		
	}
	
	
	
	
	
	
	
}
