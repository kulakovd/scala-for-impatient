package ch12.ex6

object Ch12_Ex6 extends App {
	print(largest(_ * 10, 1 to 10))

	def largest(fun: Int => Int, inputs: Seq[Int]) = {
		inputs.maxBy(fun)
	}
}
