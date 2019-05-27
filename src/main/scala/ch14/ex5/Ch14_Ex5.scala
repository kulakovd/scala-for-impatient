package ch14.ex5

object Ch14_Ex5 extends App {
	val list = List(List(3, 8), 2, List(5))
	println(leafSum(list))

	def leafSum(list: List[Any]): Int = {
		(list map {
			case x: Int => x
			case l: List[Int] => l.sum
			case _ => 0
		}).sum
	}
}
