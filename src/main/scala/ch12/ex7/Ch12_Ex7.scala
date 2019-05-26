package ch12.ex7

object Ch12_Ex7 extends App {
	val pairs = (1 to 10) zip (11 to 20)
	print(pairs.map(adjustToPair(_ + _)).mkString(" "))

	def adjustToPair(fun: (Int, Int) => Int) = {
		pair: (Int, Int) => fun(pair._1, pair._2)
	}
}
