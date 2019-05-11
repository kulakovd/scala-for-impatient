package ch3.ex8

import scala.collection.mutable.ArrayBuffer

object Ch3_Ex8 extends App {
	val buffer = ArrayBuffer(5, 2, 3, -1, 5, -2, -3, 0)
	print("Исоходный массив: ")
	println(buffer.mkString(", "))

	val positionsToRemove = for (i <- buffer.indices if buffer(i) < 0) yield i
	print("Индексы отрицательных элементов: ")
	println(positionsToRemove.mkString(", "))

	for (i <- positionsToRemove.reverse) buffer.remove(i)
	print("Без отрицательных элементов: ")
	println(buffer.mkString(", "))
}
