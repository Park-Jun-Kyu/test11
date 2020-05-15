package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Medical_record implements InitializingBean,DisposableBean {

	private int num;
	private String date;
	private String doctor;
	private String nurse;
	//치료 - 감기증상
	private String heal;
	private String days;
	
	
	public Medical_record() {
		
	}
	
	public Medical_record(int num,String date,String doctor,String nurse,String heal,String days) {
		this.num = num;
		this.date =date;
		this.doctor = doctor;
		this.nurse = nurse;
		this.heal = heal;
		this.days = days;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public String getHeal() {
		return heal;
	}

	public void setHeal(String heal) {
		this.heal = heal;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("medical destory 실행");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("medical after 실행");
		
	}
	
	
	
	
	
	
	
	
	
}
