package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	//around
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		//시작전 실행 명령
		System.out.println("(around)시작시간 : "+System.currentTimeMillis());
		
		try {
			return joinpoint.proceed(); //실행메소드 호출
				
			
		}finally {
			System.out.println("(around)메소드 종료시간 "+System.currentTimeMillis());
		}
		
	}
	//before
	public void beforeadvice() {
		System.out.println("(before)메소드 시작시간 :"+System.currentTimeMillis());
		
	}
	
	
}
