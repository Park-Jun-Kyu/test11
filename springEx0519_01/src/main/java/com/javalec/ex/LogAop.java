package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("(around)시작시간 :"+System.currentTimeMillis());
		
		try {
			return joinPoint.proceed();
			
			
		} finally {
			System.out.println("(around)메소드 종료시간 "+System.currentTimeMillis());
		}
		
		
	}
	
	public void beforeadvice() {
		
		System.out.println("(before)메소드 시작시간 :"+System.currentTimeMillis());
	}
	
	
	
	
	
}
