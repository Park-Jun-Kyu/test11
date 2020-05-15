package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member implements InitializingBean,DisposableBean {
	
	private int num;
	private String name;
	private int age;
	private String tel;
	private String address;
	//수술기록 -  13년도 암수술
	private String record;
	
	
	public Member() {
		
	}
	
	public Member(int num,String name,int age,String tel,String address,String record) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
		this.record = record;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public void destroy() throws Exception {
		System.out.println("member destroy 실행");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("member after 실행");
		
	}
	
	
	
	
	
	
	
	

}
