package ch14.ex9

object Ch14_Ex9 extends App {
	val list = List[Option[Int]](Some(2), Some(4), None, Some(9))
	val sum = list.map { case Some(x) => x; case _ => 0 }.sum
	println(sum)
}
