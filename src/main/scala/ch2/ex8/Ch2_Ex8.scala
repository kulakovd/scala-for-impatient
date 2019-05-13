package ch2.ex8

object Ch2_Ex8 extends App {
	println(product("Hello"))

	def product(s: String) = s.foldLeft(1L)(_ * _)
}
