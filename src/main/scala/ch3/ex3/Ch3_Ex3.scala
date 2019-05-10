package ch3.ex3

object Ch3_Ex3 extends App {
	var a = Array(1, 2, 3, 4, 5)
	a = (for (i <- a.indices)
		yield if (i % 2 == 0) {
			if (i+1 == a.length) a(i) else a(i+1)
		} else {
			a(i-1)
		}).toArray


	println(a.mkString(", "))
}
