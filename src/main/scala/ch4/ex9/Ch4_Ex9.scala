package ch4.ex9

object Ch4_Ex9 extends App {
	def lteqgt(values: Array[Int], v: Int) = {
		(values.count(_ < v), values.count(_ == v), values.count(_ > v))
	}

	val result = lteqgt(Array(4, 3, 0, -1, 4, 8, 1, 3), 4)
	println(result)
}
