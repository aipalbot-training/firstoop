package com.aipalbot.student.firstoop;

public class Student {
	//properties or members of the class or attributes
	public String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) { //arg or param
		this.name = name; //this means an imaginary instance/object of the current Class
	}
	
	public String dept;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public String level;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	
	//getter and setter --- boilerplate 
	//setter is used to set value to our variable
	//getter is used to retrieve the value that we set
	
	
}
