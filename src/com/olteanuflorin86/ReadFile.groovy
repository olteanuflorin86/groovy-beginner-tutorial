package com.olteanuflorin86


/*
1. How to read files as String 
2. How to read files as List 
3. How to read files as Array 
4. How to read files line by line 
5. How to delete a file 
 */

// Reading files


String filePath = "data1.txt"
// above we could also used the absolute path...

File myFile = new File(filePath);

// 1. How to directly read entire file content as String:
println myFile.text

// 2. Collect lines into a list
def list = myFile.collect { it }
println list

// 3. Store file content into an array
def array = myFile as String[]
println array

// + Read file into a list of String
def lines = myFile.readLines()
println lines

// 4. Read file line by line (every line will be a String)
myFile.eachLine { line ->
	println line
}

// 4.2 Read file line by line with line number (every line will be a String)
// line number starts from 1, not 0...
myFile.eachLine { line, lineNr ->
	println lineNr + " : " +line
}

// 4.2.1 Read file line by line with line no (every line will be a String) - example2
def lineRange = 2..4
def lineList = []
myFile.eachLine { line, lineNr ->
	if(lineRange.contains(lineNr)) {
		lineList.add(line)
	}
}
println "lineList "+lineList


// Read the file with a reader
def line2;
myFile.withReader { reader ->
	while(line2 = reader.readLine() != null)
		println line2
}

// Read the file with a new reader (like BufferedReader in Java, somehow) 
// THIS DOESN"T AUTOMATICALLY CLOSE THE INPUT STREAM
def outputFile = "data2.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()

// When working with Binary Files - read content as bytes
byte[] contents = myFile.bytes
println contents

// Get the size of file (in bytes)
println myFile.length()

// Check if resource is file or directory:
println myFile.isFile()
println myFile.isDirectory() 

// Get list of files (+ folders) from a directory:
new File("D:/").eachFile {
	files -> 
		println files.getAbsolutePath()
}

// Display recursively all files from a directory & subdirectory (it will take a while...)
//new File("D:/").eachFileRecurse {
//	files ->
//		println files.getAbsolutePath()
//}

// Copy file data from a file to another file:
def newFile = new File("data3.txt")
newFile << myFile.text

// 5. Delete a file
println newFile.delete()
