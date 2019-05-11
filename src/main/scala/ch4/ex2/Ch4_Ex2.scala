package ch4.ex2

import java.io.File
import java.util.Scanner

import scala.collection.mutable

object Ch4_Ex2 extends App {
	val words = mutable.Map[String, Int]()

	val file = new File("src/words.txt")
	val scanner = new Scanner(file)

	while (scanner.hasNext) {
		val string = scanner.next().toLowerCase()
		if (words.contains(string))
			words(string) += 1
		else
			words += (string -> 1)
	}

	println(words.mkString("(\n", ",\n", "\n)"))
}
