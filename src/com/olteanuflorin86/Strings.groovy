package com.olteanuflorin86

// Examples of strings ('...', "...", '''...''', """...""", /.../, $/.../$)
// we can use def or String

def string1 = 'apple'
println string1
//OR:
String string11 = 'apple'
println string11
println string1 + " is a fruit"

def string2 = "orange"
println string2
println "$string2 is a fruit"
def string22 = "orange is \"nice\""
println string22

println string2[0]

println string2[0..2]
println string2[2..1]
println string2[0,1,3]

// for multilines
def string3 = '''banana
is a
healthy food'''
println string3

// for multilines
def string4 = """grapes
are good
for you
too"""
println string4

// /.../ are particularly useful for Regex (also because we don't need to escape "") (and we have multiline also)
def string5 = /cherries nice nice/
println string5
def string55 = /cherries nice "nice"/
println string55

// $/.../$ are particularly useful for Regex (also because we don't need to escape "") (and we have multiline also)
def string6 = $/plums very nice/$
println string6
def string66 = $/cherries nice "nice"/$
println string66

// concat
println string2.concat(" is a nice fruit")

// length
println string4.length()

// getClass
println string2.getClass()

// indefOf
println string2.indexOf("a")

// substring
println string2.substring(1)
println string2.substring(1, 3)

// subSequence
println string2.subSequence(1, 3)

// split (I think it gives us a list)
println string3.split(" ")

// using minus symbol "-" (we can remove something like a word from the string)
println string3-("is")

// replace
println string3.replace("healthy", "very healthy")

// toLowerCase, toUpperCase
println "Chair".toLowerCase()
println "Chair".toUpperCase()

// toList (list of characters)
println string3.toList()

// using multiply symbol "*"
println string2*2

// equals, equalsIgnoreCase
println string2.equals(string2)
println string2.equals("orange")
println "orange".equals("orange")
println "OranGe".equalsIgnoreCase("orange")


