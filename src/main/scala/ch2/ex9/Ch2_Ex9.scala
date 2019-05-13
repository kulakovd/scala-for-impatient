package ch2.ex9

object Ch2_Ex9 extends App {
	println(product("Hello"))

	def product(s: String): Long = {
		if (s.length == 1)
			s.head.toLong
		else {
			product(s.head.toString) * product(s.tail)
		}
	}
}
