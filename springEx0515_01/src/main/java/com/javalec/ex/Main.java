package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh(); // initializingBean()
		
		Student student = ctx.getBean("student",Student.class);
		
		
		
		System.out.println("학생이름 : " + student.getName());
		System.out.println("학생나이 : " + student.getAge());

		ctx.close(); // disposableBean()
		
		
	}

}
