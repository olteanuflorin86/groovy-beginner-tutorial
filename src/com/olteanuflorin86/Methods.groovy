package com.olteanuflorin86

def printHello() {
	println "Hello"
}

printHello()

// Default parameter:
def sum(int a, int b=10) {
//	return a+b;
	a + b
}
// Method overloading:
def sum() {
	println 'sum'
}

println "Sum is " + sum(1,2)
println sum(1)
sum()


// Actual methods in classes:
class SomeClass {
	def someMethodInSomeClass() {
		println "someMethodInSomeClass"
	}
}

def sc1 = new SomeClass()
sc1.someMethodInSomeClass()