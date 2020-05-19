package com.javalec.ex;

public class StudentScore {

	int stu_num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void stuScore_print() {
		System.out.println("학생성적정보 : "+stu_num+"/"+kor+"/"+eng);
		
	}
	
	
	public int getStu_num() {
		return stu_num;
	}
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
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
