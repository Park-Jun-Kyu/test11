package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	
	private String name ;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public Student(String name,int number,int kor,int eng,int math) {
		this.name = name;
		this.number =  number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}
	
	public void Stu_dent() {
		System.out.println("이름 : "+getName());
		System.out.println("숫자 : "+getNumber());
		System.out.println("국어 : "+getKor());
		System.out.println("영어 : "+getEng());
		System.out.println("숫자 : "+getMath());

	
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

}
