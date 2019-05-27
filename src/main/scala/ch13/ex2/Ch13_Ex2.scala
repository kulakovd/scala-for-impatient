package ch13.ex2

import scala.collection.immutable

object Ch13_Ex2 extends App {
	println(indexes("Mississippi").mkString(" "))

	def indexes(string: String): immutable.Map[Char, List[Int]] = {
		var result = immutable.Map[Char, List[Int]]()

		for (i <- 0 until string.length) {
			val c = string(i)

			if (!result.contains(c)) {
				result += (c -> List[Int]())
			}

			result += (c -> (result(c) :+ i))
		}

		result
	}
}
