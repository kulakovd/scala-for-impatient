package ch3.ex9

import scala.collection.mutable.ArrayBuffer

object Ch3_Ex9 extends App {
	val buffer = ArrayBuffer(5, 2, 3, -1, 5, -2, -3, 0)
	print("Исоходный массив: ")
	println(buffer.mkString("[", ", ", "]"))

	val positionsToKeep = for (i <- buffer.indices if buffer(i) >= 0) yield i
	print("Индексы положительных элементов: ")
	println(positionsToKeep.mkString("[", ", ", "]"))

	for (i <- positionsToKeep.indices)
		if (i != positionsToKeep(i)) buffer(i) = buffer(positionsToKeep(i))
	print("Отрицательные в конце: ")
	println(buffer.mkString("[", ", ", "]"))

	buffer.trimEnd(buffer.length - positionsToKeep.length)
	print("Без отрицательных элементов: ")
	println(buffer.mkString("[", ", ", "]"))
}
