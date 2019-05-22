package ch9.ex2

import java.io.{File, PrintWriter}

import scala.io.Source

object Ch9_Ex2 extends App {
	val source = Source.fromFile("src/res/ch9ex2_tabs.txt", "UTF-8")
	val contents = source.mkString
	source.close()

	val tabsRegex = "\\t".r
	val result = tabsRegex.replaceAllIn(contents, " " * 2)

	val out = new PrintWriter("src/res/ch9ex2_spaces.txt")
	out.println(result)
	out.close()
}
