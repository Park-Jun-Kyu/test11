package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	ctx.load("appCTX.xml");
	ctx.refresh();
	
	
	
	ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class);
		System.out.println(serverInfo.getAuth());
		System.out.println(serverInfo.getDriverClassName());
		System.out.println(serverInfo.getUrl());
}
	
	
}
