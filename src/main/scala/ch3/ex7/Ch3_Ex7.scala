package ch3.ex7

object Ch3_Ex7 extends App {
	val array = Array(1,2,2,3,5,6,7,2,6)
	println(array.mkString(", "))
	println(array.distinct.mkString(", "))
}
