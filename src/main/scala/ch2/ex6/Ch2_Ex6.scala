package ch2.ex6

object Ch2_Ex6 extends App {
	var result: Long = 1
	for (c <- "Hello") result *= c
	println(result)
}
