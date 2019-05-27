package ch14.ex1

object Ch14_Ex1 extends App {
	val pair = swap((1, 5))
	println(pair)

	def swap(p: (Int, Int)) = {
		val (a, b) = p
		(b, a)
	}
}
