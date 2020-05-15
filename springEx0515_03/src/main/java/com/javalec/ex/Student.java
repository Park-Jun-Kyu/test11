package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {

	
	
	String name;
	int age;
	
	public Student() {
		
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	public void initMethod() {
		System.out.println("initMethod()");
		
	}
	
	public void destoryMethod() {
		System.out.println("destoryMethod()");
		
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

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student destroy들어옴");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Student after들어옴");
		
	}
	
	
	
	
	
}
