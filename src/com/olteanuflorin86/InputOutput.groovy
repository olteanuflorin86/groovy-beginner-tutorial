package com.olteanuflorin86

def getUserName() {
	print "Your name is: "
	def userName = System.console().readLine();
	
	println "User name is $userName"
}

// the below would work in a CMD
//getUserName()


def getTwoNumbersFromUserCalculateSum() {
	print "Your first number: "
	def number1 = System.console().readLine().toInteger()
	print "Your second number: "
	def number2 = System.console().readLine().toInteger()
	
	println "Sum of the two numbers is ${number1+number2}"
}

// the below would work in a CMD
//getTwoNumbersFromUserCalculateSum()


// Besides print and println we can also use printf:
//printf ("My name is %s.\n", "William");
//OR:
printf "My name is %s.\n", "William"
// we can also use %d, %.3f, etc...
// and we can also add padding (before or after) when formatting... like for strings...