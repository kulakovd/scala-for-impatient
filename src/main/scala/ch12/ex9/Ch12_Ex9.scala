package ch12.ex9

object Ch12_Ex9 extends App {
	val words = Array("Hello", "World")
	val lens = Array(5, 5)

	val fun = (_: String).length == (_: Int)

	println(corresponds(words, lens, fun))

	def corresponds[A, B](a: Seq[A], b: Seq[B], fun: (A, B) => Boolean): Boolean = {
		a.corresponds(b)(fun)
	}
}
