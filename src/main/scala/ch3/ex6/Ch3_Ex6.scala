package ch3.ex6

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Ch3_Ex6 extends App {
	val array = Array(54, 12, 71, 90, 2, 42)
	Sorting.quickSort[Int](array)(Ordering.Int.reverse)
	println(array.mkString(", "))

	var arrayBuffer = ArrayBuffer(54, 12, 71, 90, 2, 42)
	arrayBuffer = arrayBuffer.sortWith(_ > _)
	println(arrayBuffer.mkString(", "))
}
