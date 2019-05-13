package ch2.ex5

object Ch2_Ex5 extends App {
	def countdown(n: Int): Unit = {
		for (i <- 10 to 0 by -1) println(i)
	}

	countdown(10)
}
