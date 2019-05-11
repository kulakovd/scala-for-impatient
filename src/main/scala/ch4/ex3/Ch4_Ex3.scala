package ch4.ex3

import java.io.File
import java.util.Scanner

import scala.collection.immutable

object Ch4_Ex3 extends App {
	var words = immutable.Map[String, Int]()

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
