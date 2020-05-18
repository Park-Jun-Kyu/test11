package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String config = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("서버를 선택하세요.1)test 2)server");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			config="test";
			break;

		case 2:
			config="server";
			break;
		}
		
		scan.close();
		
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(AppConfig1.class,AppConfig2.class);
		
		ctx.refresh();
		
		ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class);
		
		System.out.println(serverInfo.getIpNum());
		System.out.println(serverInfo.getPortNum());
		
		
		ctx.close();
	}

}
