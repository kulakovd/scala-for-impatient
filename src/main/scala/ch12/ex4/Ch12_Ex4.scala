package ch12.ex4

object Ch12_Ex4 extends App {
	val n = 5
	//noinspection SimplifiableFoldOrReduce
	val fact = (1 to n).foldLeft(1)((f, i) => f * i)
	println(fact)
}
