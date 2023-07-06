package com.olteanuflorin86

// Examples of lists:

def list1 = [1,2,3];
println list1

def list2 = ["One", "Two", "Three"];
println list2

def list3 = [1, "Two", 3]
println list3

def list4 = [1, ["Two", "Three"], 4]
println list4

def list5 = [1, 1, 2, 1, ]
println list5

def list6 = []
println list6


// How we can use lists (and there are many many methods):

println list1[0]
println list1[-3]
println list1[-1]
println list4[1]
println list4[1][0]

// get
println list1.get(0)
println list4.get(1).get(0)

def list7 = list5[0..2]
println list7
list7 = list5[2..0]
println list7

// contains
println list5.contains(2)
println list4[1].contains("Three")

// size
println list4.size();
println list4[1].size();

// add
list7.add(66)
println list7
list7.add(0,12)
println list7

// << - some sort of a concatenation operator
list7<<41
println list7

// concatenation
list7 = [7] + list7 + [9, 16]
println list7

// plus
list7 = list7.plus(11)
list7 = list7.plus(list2)
println list7

// opposite of concatenation
list7 = list7 - "One"
println list7

// minus
list7 = list7.minus("Two")
println list7

// remove, removeLast, etc
list7.removeLast()
println list7
list7.remove(0)
println list7

// pop (remove the first element from the list)
list7.pop()
println list7

// intersect
def list8 = list7.intersect(list1)
println list8
println list8.intersect([2,3])

// reverse
list8 = list8.reverse()
println list8

// sort
list8 = list7.sort()
println "Before sorting: " + list7
println "After Sorting $list8" 

// isEmpty
println list8.isEmpty()

// getClass
println list8.getClass()

// And there are many more methods and things we can do with these lists...