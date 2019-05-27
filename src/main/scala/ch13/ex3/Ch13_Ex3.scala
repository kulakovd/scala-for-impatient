package ch13.ex3

import scala.collection.mutable.ListBuffer

object Ch13_Ex3 extends App {
	val list = ListBuffer(1, 2, 3, 4, 5, 6, 7)
	removeEverySecond(list)
	println(list.mkString(", "))

	var list2 = ListBuffer(1, 2, 3, 4, 5, 6, 7)
	list2 = removeEverySecond_2(list2)
	println(list2.mkString(", "))

	def removeEverySecond(list: ListBuffer[Int]): Unit = {
		val start = System.nanoTime
		for (i <- (list.indices by 2).reverse) {
			list.remove(i)
		}
		println(s"removeEverySecond 1 ${System.nanoTime - start}")
	}

	def removeEverySecond_2(list: ListBuffer[Int]): ListBuffer[Int] = {
		val start = System.nanoTime
		val r = new ListBuffer[Int]()
		for (i <- 1 until list.length by 2) {
			r.append(list(i))
		}
		println(s"removeEverySecond 2 ${System.nanoTime - start}")
		r
	}
}
