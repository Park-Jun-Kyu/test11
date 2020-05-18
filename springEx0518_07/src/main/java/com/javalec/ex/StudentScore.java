package com.javalec.ex;

public class StudentScore {

	String grade;
	int kor;
	int eng;
	int math;
	int total ;
	double avg ;
	
	
	public void Stu_score() {
		System.out.println("국어점수 : "+getKor());
		System.out.println("영어점수 : "+getEng());
		System.out.println("수학점수 : "+getMath());
		System.out.println("총합점수 : "+getTotal());
		System.out.println("평균 : "+getAvg());
		
	}
	
	public StudentScore(String grade,int kor,int eng,int math) {
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (kor+eng+math)/3;
		
	}
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
	
	
	
	
	
}
