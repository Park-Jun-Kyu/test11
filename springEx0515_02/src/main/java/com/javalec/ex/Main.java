package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		Member_all member_all = ctx.getBean("member_all",Member_all.class);
		
		ArrayList<Member> list = member_all.getList();
		
		Medical_record medical_record = ctx.getBean("medical_record1",Medical_record.class);
		
	
		for(int i=0; i<list.size(); i++) {
			Member mem = list.get(i);
			if(mem.getNum() == medical_record.getNum()) {
				
				System.out.print("회원번호 :" + mem.getNum() + "//");
				System.out.print("회원이름 :" + mem.getName() + "//");
				System.out.print("회원나이 :" + mem.getAge() + "//");
				System.out.print("회원연락처 :" + mem.getTel() + "//");
				System.out.println("회원주소 :" + mem.getAddress() + "//");
				System.out.print("회원기록 :" + mem.getRecord() + "//");
				
				
				System.out.print("회원날짜 :" + medical_record.getDate() + "//");
				System.out.print("회원담당의사 :" + medical_record.getDoctor() + "//");
				System.out.print("회원담당간호사 :" + medical_record.getNurse() + "//");
				System.out.print("회원증상 :" + medical_record.getHeal() + "//");
				System.out.println("회원방문날짜 :" + medical_record.getDays() + "//");
				
			}
			
			
		}
		
		ctx.close();
	}
}
