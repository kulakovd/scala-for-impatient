package ch3.ex2

object Ch3_Ex2 extends App {
	val a = Array(1, 2, 3, 4, 5)
	for (i <- 0 until a.length-1 by 2) {
		val tmp = a(i)
		a(i) = a(i+1)
		a(i+1) = tmp
	}

	println(a.mkString(", "))

	// тоже, но без for
	var b = Array(1, 2, 3, 4, 5)
	b = b.grouped(2).flatMap(_.reverse).toArray

	println(b.mkString(", "))
}
