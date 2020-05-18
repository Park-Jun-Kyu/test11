package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class);
		
		System.out.println(serverInfo.getAuth());
		System.out.println(serverInfo.getDriverClassName());
		System.out.println(serverInfo.getUrl());
		System.out.println(serverInfo.getLine());
		System.out.println(serverInfo.getStatn_nm());
		System.out.println(serverInfo.getAdres());
		System.out.println(serverInfo.getRonmadr());
		System.out.println(serverInfo.getTelno());
		
		System.out.println("-------------------------------------");
		
		

	}

}
