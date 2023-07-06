package com.olteanuflorin86

// There are multiple ways to write to a file...

File myFile = new File("outputFile1.txt")

// we can write the stream of data:
myFile.write("This is Line 1\n");
//OR:
myFile << "This is Line 2\n"
// we can write the stream of data but overwrite all the content from the file:
myFile.text = "This is Line 3\n"

// We can also use a writer (also overwrites everything above):
myFile.withWriter { writer ->
	writer.writeLine("This is Line 4\n")
}

// We can use append to avoid overwriting
myFile.append("This is Line 5\n")

// Copy the content from a file to another file:
def newFile = new File("outputFile2.txt")
newFile << myFile.text

// Clear/ empty a file:
newFile.bytes = []

// Rename a file (we can give a destination or String with a pathname)
//newFile.renameTo(new File("outputFile22.txt")) 
//newFile.renameTo("outputFile22.txt") 

// Delete a file (when I rename it above maybe it would not work all the time...)
newFile.delete()

println myFile.text
//println newFile.text

// Size of file (bytes)
println myFile.length()

// Verify if the resource is file or folder or hidden file
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()