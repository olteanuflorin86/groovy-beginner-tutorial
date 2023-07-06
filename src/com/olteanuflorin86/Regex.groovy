package com.olteanuflorin86

// In Groovy the syntax is something like this for Regex: ~"expression"

// useful sites to check and build Regexes:
// https://regexr.com
// https://buildregex.com

// Example 1:
def match1 = "Groovy" =~ "Groovy"
println match1
println match1[0]
if(match1) {
	for(i in match1)
		println i
	
} else {
	println "No match found"
}

// Example 2:
def match2 = "Groovy" =~ "o"
println match2

if(match2) {
	for(i in match2)
		println i
	
} else {
	println "No match found"
}

// Example 3:
def regex = /(?:[^Groovy]*)/
def match3 = "This is Groovy Regex" =~ regex
println match3

if(match3) {
	for(i in match3)
		println i
	
} else {
	println "No match found"
}