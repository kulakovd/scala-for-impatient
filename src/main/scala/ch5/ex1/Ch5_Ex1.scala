package ch5.ex1

object Ch5_Ex1 extends App {
	val counter = new Counter(Int.MaxValue)
	println(counter.current)

	counter.increment()
	println(counter.current)
}