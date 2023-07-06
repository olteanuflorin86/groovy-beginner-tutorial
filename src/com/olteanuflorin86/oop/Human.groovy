package com.olteanuflorin86.oop

class Human {

	private String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name
	}
	
	public void printName() {
		println "Human name: $name";
	}
	
	public void printName2() {
		println "Human name2: $name";
	}
	
	static void main(args) {
		// TODO Auto-generated method stub
		
	}
}
