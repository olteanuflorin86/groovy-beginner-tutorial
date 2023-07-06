package com.olteanuflorin86.oop

class ExtendsAbstractClassEx extends AbstractClassEx {

	private int property3;
	
	public int getProperty3() {
		return property3;
	}

	public void setProperty3(int property3) {
		this.property3 = property3;
	}

	@Override
	public Object abstractMethodExample() {
		println "This is a implementation of an abstract class"
		return null;
	}
}
