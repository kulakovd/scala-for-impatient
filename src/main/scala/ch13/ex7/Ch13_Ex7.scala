package ch13.ex7

object Ch13_Ex7 extends App {
	val prices = List(5.0, 20.0, 9.95)
	val quantities = List(10, 2, 1)

	val result = (prices zip quantities) map {
		((_: Double) * (_: Int)).tupled
	}

	println(result.mkString(", "))
}
