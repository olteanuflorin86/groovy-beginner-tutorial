package com.olteanuflorin86

// define variables:
def firstName = "Florin"
String lastName = "Olteanu"
//weather = "Sunny"
def weather = "sunny"
def age = 37
int _numBer1 = 1
double x = 2.1
double X = 3.3

println "first name" + firstName
println 'last name is' + lastName
//println "weather is very $weather"
println "weather is ${weather}"
println age 
println _numBer1
println x
println X

// dynamically typed:
def someVariable = "someVariable"
someVariable = 23
println someVariable

// multiple assignments:
def (String a, b, float c, d) = ["tree", 2, 3.1]
println a
println b
println c
println d
