package com.olteanuflorin86.oop

class ClassesAndObjects {
	
	private String property1
	private int property2
	
	def setProperty1(String property1) {
		this.property1 = property1
	}
	
	def setProperty2(int property2Value) {
		property2 = property2Value
	}
	
	def getProperty1() {
		return property1
	}
	
	def getProperty2() {
		property2
	}
	
	def getTheTwoProperties() {
		return "property1 is " + getProperty1() + " and property2 is " + getProperty2()
	}
	
	static void main(args) {
	
		ClassesAndObjects cao1 = new ClassesAndObjects() 
		def cao2 = new ClassesAndObjects() 
		cao1.setProperty2(22);
		println "property2 of cao1 is " + cao1.getProperty2()
		println "Properties of cao1 are: " + cao1.getTheTwoProperties()
		
		def human1 = new Human()
		human1.setName("William");
		println "student1 name is "+ human1.getName()
		human1.printName();
		human1.printName2();
		
		def student1 = new Student("Jane", 9.40);
		student1.printName();
		student1.printName2();
		student1.printStudentNameAndAverage();
		
		// Abstract classes...
		def eacx1 = new ExtendsAbstractClassEx(); 
		eacx1.setProperty1("property1 of eacx1");
		eacx1.setProperty2(111);
		eacx1.setProperty3(31);
		println "property1 of eacx1: " + eacx1.getProperty1();
		println "property2 of eacx1: " + eacx1.getProperty2();
		println "property3 of eacx1: " + eacx1.getProperty3();
		eacx1.concreteMethodExample();
		eacx1.abstractMethodExample();
		
		// Interfaces...
		def iie1 = new ImplementsInterfaceEx();
		iie1.method1();
		iie1.method2()
		iie1.method3()
		
			
	}
	
}
