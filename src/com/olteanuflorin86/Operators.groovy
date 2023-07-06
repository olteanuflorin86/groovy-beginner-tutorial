package com.olteanuflorin86

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

// http://docs.groovy-lang.org/latest/html/documentation/core-operators.html

// ---------------------------------------------------------------------------------

	//1. Arithmetic operators:

	//1.1. Normal arithmetic operators:
/*
	+
	-
	*
	/
	%
	**
*/
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8
//also we can have things like this:
assert 9.intdiv(2) == 4
assert 2.3.plus(1.01) == 3.31

	//1.2. Unary operators:
/*	
    +
	-
	++
	--
*/
assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1
//And:
def a = 2
def b = a++ * 3
assert a == 3 && b == 6

def c = 3
def d = c-- * 2
assert c == 2 && d == 6

def e = 1
def f = ++e + 3
assert e == 2 && f == 5

def g = 4
def h = --g + 1
assert g == 3 && h == 4

	// 1.3. Assignment arithmetic operators:
/*
	+=
	
	-=
	
	*=
	
	/=
	
	%=
	
	**=  
*/
def a2 = 4
a2 += 3
assert a2 == 7

def b2 = 5
b2 -= 3
assert b2 == 2

def c2 = 5
c2 *= 3
assert c2 == 15

def d2 = 10
d2 /= 2
assert d2 == 5

def e2 = 10
e2 %= 3
assert e2 == 1

def f2 = 3
f2 **= 2
assert f2 == 9

// ---------------------------------------------------------------------------------

	// 2. Relational operators:
/*
	 ==
	!=
	<
	<=
	>
	>=
	===
	!== 
*/
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2
//And for === and !==:
@EqualsAndHashCode
class Creature { String type }

def cat = new Creature(type: 'cat')
def copyCat = cat
def lion = new Creature(type: 'cat')

assert cat.equals(lion) 
assert cat == lion      

assert cat.is(copyCat)  
assert cat === copyCat  
assert cat !== lion     

// ---------------------------------------------------------------------------------

	// 3. Logical operators:
/*
	&&
	||
	!  
*/
assert !false
assert true && true
assert true || false

	// 3.1. Precedence:
assert (!false && false) == false
assert true || true && false

	// 3.2. Short-circuiting:
boolean checkIfCalled() {
	called = true
}

called = false
true || checkIfCalled()
assert !called

called = false
false || checkIfCalled()
assert called

called = false
false && checkIfCalled()
assert !called

called = false
true && checkIfCalled()
assert called

// ---------------------------------------------------------------------------------

	// 4. Bitwise and bit shift operators:

	// 4.1. Bitwise operators:
/*
	&
	|
	^
	~  \
*/
int a3 = 0b00101010
assert a3 == 42
int b3 = 0b00001000
assert b3 == 8
assert (a3 & a3) == a3
assert (a3 & b3) == b3
assert (a3 | a3) == a3
assert (a3 | b3) == a3

int mask = 0b11111111
assert ((a3 ^ a3) & mask) == 0b00000000
assert ((a3 ^ b3) & mask) == 0b00100010
assert ((~a3) & mask)    == 0b11010101

	// 4.2. Bit shift operators:
/*
	<<
	>>
	>>>
*/
assert 12.equals(3 << 2)
assert 24L.equals(3L << 3)
assert 48G.equals(3G << 4)

assert 4095 == -200 >>> 20
assert -1 == -200 >> 20
assert 2G == 5G >> 1
assert -3G == -5G >> 1

// --------------------------------------------------------------------------------

	// 5. Conditional operators:

	// 5.1. Not operator:

assert (!true)    == false
assert (!'foo')   == false
assert (!'')      == true

	// 5.2. Ternary operator:

String someString = "someString"
result = (someString!=null && someString.length()>0) ? 'Found' : 'Not found'
// or even:
result = someString ? 'Found' : 'Not found'

	// 5.3. Elvis operator:
class User { String name }
def user = new User(name: 'John') 
// instead of:
displayName = user.name ? user.name : 'Anonymous'
// we can use the Elvis operator and write more compact:
displayName = user.name ?: 'Anonymous'

	// 5.4. Elvis assignment operator:
@ToString(includePackage = false)
class Element {
	String name
	int atomicNumber
}
def newElement = new Element(name: 'Helium')
newElement.with {
	name = name ?: 'Hydrogen'   // existing Elvis operator
	atomicNumber ?: 2           // new Elvis assignment shorthand
}
assert newElement.toString() == 'Element(Helium, 2)'

// --------------------------------------------------------------------------------

	// 6. Object operators 

	// 6.1. Safe navigation operator (null-safe operator) (?.)
//def person = Person.find { it.id == 123 }
//def name = person?.name
//assert name == null

	// 6.2. Direct field access operator (.@)
//class User {
//	public final String name
//	User(String name) { this.name = name}
//	String getName() { "Name: $name" }
//}
//def user = new User('Bob')
//assert user.@name == 'Name: Bob'

	// 6.3. Method pointer operator (.&)
//def str = 'example of method reference'
//def fun = str.&toUpperCase
//def upper = fun()
//assert upper == str.toUpperCase()

	// 6.4. Method reference operator (::)
//...





	// 7. Regular expression operators
	// 7.1. Pattern operator (~)
	// 7.2. Find operator (=~)
	// 7.3. Match operator (==~)
	// 7.4. Comparing Find vs Match operators





	//8. Other operators
	//8.1. Spread operator (*.)
	//8.2. Range operator ([..])
	//8.3. Spaceship operator (<==>)
	//8.4. Subscript operator ([])
	//8.5. Safe index operator (?[])
	//8.6. Membership operator (in)
	//8.7. Identity operator (==)
	//8.8. Coercion operator (as)
	//8.9. Diamond operator (<>)
	//8.10. Call operator





	// 9. Operator precedence