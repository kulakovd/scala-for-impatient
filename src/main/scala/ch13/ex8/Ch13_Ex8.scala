package ch13.ex8

object Ch13_Ex8 extends App {
	val array = Array(1, 2, 3, 4, 5, 6)
	val grouped = f(array, 3)
	println(grouped.map(e => e.mkString("[", ", ", "]")).mkString("[", ", ", "]"))

	def f[A](array: Array[A], n: Int) = {
		array.grouped(n)
	}
}
