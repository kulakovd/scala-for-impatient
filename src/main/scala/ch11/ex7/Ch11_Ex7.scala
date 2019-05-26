package ch11.ex7

object Ch11_Ex7 extends App {
	val b = BitSequence()
	b(63) = 1
	println(b(63))
	println(b)
}
