package com.javalec.ex;

public class EventBoard {

	int number;
	String name;
	String eventStart;
	String eventEnd;
	
	
	public void eventTime() {
		System.out.println(number+name+eventStart+eventEnd);
		
		
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEventStart() {
		return eventStart;
	}
	public void setEventStart(String eventStart) {
		this.eventStart = eventStart;
	}
	public String getEventEnd() {
		return eventEnd;
	}
	public void setEventEnd(String eventEnd) {
		this.eventEnd = eventEnd;
	}
	
	
	
	
	
	
}
