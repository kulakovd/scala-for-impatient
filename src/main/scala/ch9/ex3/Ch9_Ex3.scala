package ch9.ex3

import scala.io.Source

object Ch9_Ex3 extends App {
	val source = Source.fromFile("src/res/ch9ex3.txt", "UTF-8")
	println(source.mkString.split("\\s+").filter(_.length >= 12).mkString(" "))
	source.close()
}
