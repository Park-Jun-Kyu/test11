package com.javalec.ex;

public class Book {
	
	String b_num;
	String b_name;
	String b_kind;
	String b_writer;
	
	
	public void book_print() {
		System.out.println(b_num);
		System.out.println(b_name);
		System.out.println(b_kind);
		System.out.println(b_writer);
		
		
	}
	
	
	
	
	public String getB_num() {
		return b_num;
	}
	public void setB_num(String b_num) {
		this.b_num = b_num;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_kind() {
		return b_kind;
	}
	public void setB_kind(String b_kind) {
		this.b_kind = b_kind;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	
	
	
	
	
	

}
