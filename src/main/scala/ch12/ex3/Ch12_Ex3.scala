package ch12.ex3

object Ch12_Ex3 extends App {
	val n = 5
	if (n > 0) {
		//noinspection SimplifiableFoldOrReduce
		val fact = (1 to n).reduceLeft((f, i) => f * i)
		println(fact)
	} else {
		println("так факториал не вычислить")
	}
}
