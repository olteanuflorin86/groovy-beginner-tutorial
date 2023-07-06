package com.olteanuflorin86

// We have if-else if-else + switch-case

def a = 22
if(a>20) 
	println "a > 20"
  else if (a < 10) {
	println "a < 10"
} else {
	println "10 <= a <=20"
}

//def fruit = "apple"
def fruit = 22
switch(fruit) {
	case "orange":
		println "orange"
		break
	case "apple":
		println "apple"
		break
	case {fruit.equals("pineapple")}:
		println "pineapple"
		break
	default:
		println "some other fruit"
}

