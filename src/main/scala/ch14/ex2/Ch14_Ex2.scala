package ch14.ex2

object Ch14_Ex2 extends App {
	val pair = swap((1, 5))
	println(pair)

	def swap(p: (Int, Int)) = {
		val (a, b) = p
		(b, a)
	}
}
