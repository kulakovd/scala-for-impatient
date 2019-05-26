package ch12.ex2

object Ch12_Ex2 extends App {
	val max = Array(52, 100, 115, 84, 4).reduceLeft((a, b) => if (a > b) a else b)
	println(max)
}
