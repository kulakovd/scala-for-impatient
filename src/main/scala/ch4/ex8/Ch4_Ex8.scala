package ch4.ex8

object Ch4_Ex8 extends App {
	def minmax(values: Array[Int]) = {
		(values.min, values.max)
	}

	val result = minmax(Array(4, 3, 0, -1, 4, 8, 1))
	println(result)
}
