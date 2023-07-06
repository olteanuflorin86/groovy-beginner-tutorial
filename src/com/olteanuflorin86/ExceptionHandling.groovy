package com.olteanuflorin86

// Example 1:
try {
	int i = 1/0
} catch(ArithmeticException e) {
	println e
} catch(Exception e) {
	println e
//	println e.getCause()
//	println e.getMessage()
//	println e.printStackTrace()
} 
finally {
	println "end of block"
}
println "end of program"


// Example 2:
try {
	int i = 1/2
}
finally {
	println "end of block"
}
println "end of program"

// we can also use throw and throws, I think... and other stuff...