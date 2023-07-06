package com.olteanuflorin86

import org.codehaus.groovy.control.InstanceOfVerifier

// Examples of ranges - Inclusive (1..10) and Exclusive (1..<10):

def range1 = 1..5
println range1

def range2 = 1..<5
println range2

def range3 = 8..2
println range3

def range4 = 'a'..'d'
println range4

def range5 = 'b'..'a'
println range5

println range2[1]
// get
println range2.get(1)


// each (with closures)
range1.each { item ->
	print item + " "
}
println ""
range2.each { item ->
	print item + " "
}
println ""

// size
println range2.size()

// getFrom, getTo, from, to
println range2.getFrom()
println range2.getTo()
assert range2.from == 1
assert range2.to == 4

// contains
println range2.contains(2)

// isReverse
println range2.isReverse()
println range3.isReverse()

// subList
def range6 = range4.subList(1, 3)
println range6

// iterate over a range with for loop
for(int i = 0; i< range2.size(); i++) {
	print range2[i] + " ";
}
println "";

// iterate over a range with "enhanced" for loop  
for(i in range2) {
	print i + " "
}
println ""

// getClass (IntRange (groovy.lang.IntRange))
println range2.getClass()

// instanceOf
println range2 instanceof java.util.List  