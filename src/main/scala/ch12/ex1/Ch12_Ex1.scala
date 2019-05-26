package ch12.ex1

object Ch12_Ex1 extends App {
	println(values(x => x*x, -5, 5).mkString(""))

	def values(fun: Int => Int, low: Int, high: Int) = {
		(low to high).map(e => (e, fun(e)))
	}
}
