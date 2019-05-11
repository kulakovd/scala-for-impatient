package ch4.ex5

import java.io.File
import java.util.Scanner
import java.util.TreeMap

import scala.collection.JavaConversions.mapAsScalaMap

object Ch4_Ex5 extends App {
	var words = new TreeMap[String, Int]()

	val file = new File("src/words.txt")
	val scanner = new Scanner(file)

	while (scanner.hasNext) {
		val string = scanner.next().toLowerCase()
		if (words.contains(string))
			words += (string -> (words(string) + 1))
		else
			words += (string -> 1)
	}

	println(words.mkString("(\n", ",\n", "\n)"))
}
