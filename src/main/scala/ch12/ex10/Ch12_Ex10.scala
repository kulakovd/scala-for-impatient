package ch12.ex10

object Ch12_Ex10 extends App {

	if (2 == 2) {
		println("2 == 2")
	}

	unless(2 == 5) {
		println("2 != 5")
	}

	def unless(c: Boolean)(block: => Unit): Unit = {
		if (!c) {
			block
		}
	}
}
