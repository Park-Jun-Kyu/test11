package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass1 {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX2.xml");
		Student student = ctx.getBean("student",Student.class);
	
		student.student_print();
		
		
		StudentScore studentScore = ctx.getBean("studentScore",StudentScore.class);
		studentScore.stuScore_print();
		
		DoctorRecord doctorRecord = ctx.getBean("doctorRecord",DoctorRecord.class);
		doctorRecord.doctor_print();
	
		
	}

}
