package com.javalec.ex;

public class Join {
	
	int mem_num;
	int mem_id;
	int mem_pw;
	int mem_name;
	int joinDay;
	
	public void joinprint() {
		System.out.println(mem_num+mem_id+mem_pw+mem_name+joinDay);
		
		
	}
	
	
	
	public int getMem_num() {
		return mem_num;
	}
	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public int getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(int mem_pw) {
		this.mem_pw = mem_pw;
	}
	public int getMem_name() {
		return mem_name;
	}
	public void setMem_name(int mem_name) {
		this.mem_name = mem_name;
	}
	public int getJoinDay() {
		return joinDay;
	}
	public void setJoinDay(int joinDay) {
		this.joinDay = joinDay;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
