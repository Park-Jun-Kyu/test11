package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member_all implements InitializingBean,DisposableBean {

	
	ArrayList<Member>list = new ArrayList<Member>();
	
	public Member_all() {
		
	}
	
	public Member_all(ArrayList<Member>list) {
		this.list= list;
		
	}

	public ArrayList<Member> getList() {
		return list;
	}

	public void setList(ArrayList<Member> list) {
		this.list = list;
	}

	public void destroy() throws Exception {
		System.out.println("Member all destory실행");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Member all after 실행");
	}
	
	
	
	
	
	
	
}
