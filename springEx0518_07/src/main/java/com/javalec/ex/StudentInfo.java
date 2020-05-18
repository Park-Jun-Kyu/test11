package com.javalec.ex;

public class StudentInfo {
	
	String grade;
	String name;
	String subject;
	String address;
	String tel;
	
	
	public void Stu_Info() {
		System.out.println("학번 :" +getGrade());
		System.out.println("학생이름 :" + getName());
		System.out.println("학과 :"+getSubject());
		System.out.println("주소 :" + getAddress());
		System.out.println("전화번호 :" + getTel());
		
	}
	
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	

}
