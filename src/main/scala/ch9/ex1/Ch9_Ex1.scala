package ch9.ex1

import java.io.{File, PrintWriter}

import scala.io.Source

object Ch9_Ex1 extends App {
	val file = new File("src/res/ch9ex1.txt")

	val source = Source.fromFile(file, "UTF-8")
	val lines = source.getLines.toArray.reverse
	source.close()

	val out = new PrintWriter(file)
	for (line <- lines) out.println(line)
	out.close()
}
