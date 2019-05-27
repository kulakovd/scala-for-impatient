package ch13.ex1

import scala.collection.mutable

object Ch13_Ex1 extends App {
	println(indexes("Mississippi").mkString(" "))

	def indexes(string: String): mutable.Map[Char, mutable.SortedSet[Int]] = {
		val result = mutable.SortedMap[Char, mutable.SortedSet[Int]]()

		for (i <- 0 until string.length) {
			val c = string(i)

			if (!result.contains(c)) {
				result(c) = mutable.SortedSet[Int]()
			}

			result(c) += i
		}

		result
	}
}
