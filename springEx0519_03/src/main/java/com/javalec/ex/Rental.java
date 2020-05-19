package com.javalec.ex;

public class Rental {
	
	String r_num;
	String r_name;
	String r_book;
	String r_return;
	String r_tel;
	
	public void rental_print() {
		System.out.println(r_num);
		System.out.println(r_name);
		System.out.println(r_book);
		System.out.println(r_return);
		System.out.println(r_tel);
		
		
	}
	
	
	
	
	public String getR_num() {
		return r_num;
	}
	public void setR_num(String r_num) {
		this.r_num = r_num;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_book() {
		return r_book;
	}
	public void setR_book(String r_book) {
		this.r_book = r_book;
	}
	public String getR_return() {
		return r_return;
	}
	public void setR_return(String r_return) {
		this.r_return = r_return;
	}
	public String getR_tel() {
		return r_tel;
	}
	public void setR_tel(String r_tel) {
		this.r_tel = r_tel;
	}
	
	
	
	
	

}
