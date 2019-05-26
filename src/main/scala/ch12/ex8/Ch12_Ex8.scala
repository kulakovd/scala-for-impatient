package ch12.ex8

object Ch12_Ex8 extends App {
	val words = Array("Hello", "World")
	val lens = Array(5, 5)

	println(words.corresponds(lens)(_.length == _))
}
