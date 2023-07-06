package com.olteanuflorin86.oop

class Student extends Human {
	
	private String name;
	private float average;
	
	Student() {
		super()
	}
	
	Student(String name, float average) {
		super();
		this.name = name;
		this.average = average;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
	
	// Method overriding
	public void printName2() {
		println "Student name2: $name";
	}

	public void printStudentNameAndAverage() {
		println "Student name: " + getName() + " and average: " + getAverage();
	}
	
	static void main(args) {
		
	}
}
