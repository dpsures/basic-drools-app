package org.learning.model;

public class Employee {

	private String name;
	private int hireYear;	
	private String message;
	
	public Employee(int hireYear) {
		this.hireYear = hireYear;
	}
	
	public Employee(String name, int hireYear) {
		this.name = name;
		this.hireYear = hireYear;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHireYear() {
		return hireYear;
	}
	
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}		
}
