package com.javalec.ex;

public class Student {
	
	int stu_num;
	String name;
	String gradeNum;
	String classNum;
	
	public void stu_print() {
		System.out.println("학생정보"+ stu_num);
		
		
	}
	
	
	
	public int getStu_num() {
		return stu_num;
	}
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	

	
}
