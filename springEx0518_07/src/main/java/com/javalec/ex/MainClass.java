package com.javalec.ex;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.StudentInfo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		
		studentInfo.Stu_Info();
		
		StudentScore studentScore = ctx.getBean("studentScore",StudentScore.class);
		
		studentScore.Stu_score();
		
		ctx.close();
	}

}
