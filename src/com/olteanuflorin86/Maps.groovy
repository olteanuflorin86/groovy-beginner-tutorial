package com.olteanuflorin86

// Examples of maps:

def map1 = [
	"firstNumber" : "One",
	"secondNumber" : "Two"
	]
println map1

def map2 = [
	1 : 1,
	2 : 2
	]
println map2

def map3 = [
	"firstNumber" : 1,
	'secondNumber' : 2,
	] 
println map3

def map4 = [
	1 : 'one',
	2 : "two",
 	]
println map4

def map5 = [
	1 : 'one',
	"two" : 2,
	 ]
println map5

def map6 = []
println map6


println map3.firstNumber
println map3["firstNumber"]


// There are a lot of in-built methods we can use with maps

// get, getAt
println map3.get("secondNumber");
println map3.getAt("secondNumber");

// size
println map3.size()

// put
map3.put(3, "thirdNumber")
println map3

// containsKey, containsValue
println map3.containsKey(3)
println map3.containsValue(2)

// getClass
println map3.getClass()

// clone
def map3clone = map3.clone();
println map3clone

// each, eachWithIndex (using closures)
map3.each { key, value -> 
	println "$key : $value"
}

map3.each { entry ->
println "$entry.key : $entry.value" 	
}

map3.eachWithIndex { key, value, index ->
	println "$index | $key : $value"
}

map3.eachWithIndex { entry, i ->
	println "$i | $entry.key : $entry.value"
}

// entrySet
def entriesForMap3 = map3.entrySet()
println entriesForMap3

entriesForMap3.each { entry ->
	assert entry.key in ["firstNumber", "secondNumber", 3]
	assert entry.value in [1, 2, "thirdNumber"]
}

// clear
println "Map before clear: " + map3clone
map3clone.clear()
println "Map after clear: " + map3clone

// And there are many more things that can be said about maps in Groovy