package ch2.ex1

object Ch2_Ex1 extends App {
	def sgn(n: Int): Int =
		if (n > 0)
			1
		else if (n < 0)
			-1
		else
			0
}
