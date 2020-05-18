package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Logaop {
	
	
	public Object loggerAop(ProceedingJoinPoint joinPoint)throws Throwable {
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

		try {
			return joinPoint.proceed();
			
			
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("----------------------------------------");
		}
		
	}
	
	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("처음 실행 log");
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
	}
	
	
	public void afterAdive() {
		System.out.println("마지막에 실행되는 log");
		
	}

}
