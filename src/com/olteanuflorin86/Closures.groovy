package com.olteanuflorin86

// this way we can define a simple closure
def closure1 = {
	println "this is a closure"
}

// this way we can call/ execute a closure
closure1.call()



// Closures can have variables passed to them
//def closure2 = { name -> println "Hi ${name}" }
def closure2 = { name -> println "Hi $name" }
closure2.call("Mark")



// Closures can refer external variables
String myName = "Julia"
def closure3 = { name -> println "Hello $myName, it's $name" }
closure3.call("Mark")

//def someMethodThatDoesNotWork(String name) {
//	println "Hello $myName, it's $name";
//}
//someMethodThatDoesNotWork("Mark");



// Closures can be passed to methods:
def method1(clos) {
	clos.call("Mark");
}
method1(closure3);



// Closures can return values:
def closure4 = {
	name1, name2 -> 
		String newName = "Hi $name1, my name is $name2";
		return newName;
}
println closure4.call("Rhonda", "Bianca")



// Closures can be used with some methods (like each, find, findAll, any, every, collect, etc), for lists, maps, etc:
def myFruitList = ["apple", "orange", "banana"]
myFruitList.each { fruit -> println fruit}
// OR:
println myFruitList.each { it }

def myFruitMap = [
		'apple' : 'ok',
		'orange' : 'good',
		'banana' : 'good'
	]
println myFruitMap.each { it }

def myNumberList = [1, 2, 3];
println myNumberList.find { item -> item == 2 }
println myNumberList.find { item -> item == 22 }
println myNumberList.findAll { items -> items >= 2 }
println myNumberList.any { item -> item < 2 }
println myNumberList.every { item -> item > 3 }
println myNumberList.collect { item -> item + 2 }