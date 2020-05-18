package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class);
		
		System.out.println("auth : " + serverInfo.getAuth());
		System.out.println("driverClassName : " + serverInfo.getDriverClassName());
		System.out.println("url : " + serverInfo.getUrl());
		System.out.println("username1 : " + serverInfo.getUsername1());
		System.out.println("password : " + serverInfo.getPassword());
		System.out.println("name : " + serverInfo.getName());
		System.out.println("type : " + serverInfo.getType());
		System.out.println("maxActive : " + serverInfo.getMaxActive());
		System.out.println("maxWait : " + serverInfo.getMaxWait());
		
		
	}

}
