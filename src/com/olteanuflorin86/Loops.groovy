package com.olteanuflorin86

// We have for, enhanced for (for-in) and while... mostly at least...
// We also have Keywords like upto, times or step we can use

def numbers = [1,2,3,4,5]
int nr = 4

// classic for
for(def i = 0; i < 5; i++) {
	println numbers[i]
}


// enhance for <==> for-in
for(number in numbers) 
	println number

// while
while(nr>1) {
	println nr
	--nr
}

// Keywords:

// upto
1.upto(5) { item ->
	println item
}
//OR:
1.upto(5) { println "$it" }

// times
5.times { println "$it" }

// step
1.step(5, 2) { println "$it" }