package com.javalec.ex;

public class Worker {

	private String name;
	private int age;
	private String job;
	
	
	
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	//메소드
	public void getWorkInfo() {
		System.out.println("getWorkInfo 실행1");
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("직업 : " + getJob());
		System.out.println("");
	}
	
}
