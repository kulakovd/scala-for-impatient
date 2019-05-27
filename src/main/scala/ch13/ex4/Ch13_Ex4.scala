package ch13.ex4

object Ch13_Ex4 extends App {
	val a = f(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5))
	println(a.mkString(" "))

	def f(array: Array[String], map: Map[String, Int]): Array[Int] = {
		array.flatMap(e => map.get(e))
	}
}
