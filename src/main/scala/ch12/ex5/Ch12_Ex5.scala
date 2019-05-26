package ch12.ex5

object Ch12_Ex5 extends App {
	print(largest(_ * 10, 1 to 10))

	def largest(fun: Int => Int, inputs: Seq[Int]) = {
		inputs.map(fun).max
	}
}
