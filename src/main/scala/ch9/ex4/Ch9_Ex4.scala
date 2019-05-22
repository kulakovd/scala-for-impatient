package ch9.ex4

import scala.io.Source

object Ch9_Ex4 extends App {
	val source = Source.fromFile("src/res/ch9ex4.txt", "UTF-8")

	val numbers = source.mkString.split("\\s+").map(_.toDouble)

	println(s"sum: ${numbers.sum}")
	println(s"avg: ${numbers.sum / numbers.length}")
	println(s"max: ${numbers.max}")
	println(s"min: ${numbers.min}")

	source.close()
}
