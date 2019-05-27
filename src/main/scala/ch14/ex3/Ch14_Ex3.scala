package ch14.ex3

object Ch14_Ex3 extends App {
	val array = Array(1, 2, 3, 4, 5)
	val swapped = swap(array)
	println(swapped.mkString(", "))

	def swap(p: Array[Int]): Array[Int] = {
		val Array(a, b, tail @ _*) = p
		Array(b, a) ++ tail
	}
}
