package ch3.ex10

import java.util.TimeZone

object Ch3_Ex10 extends App {
	val prefix = "America/"
	val result = TimeZone.getAvailableIDs()
		.filter(_.startsWith(prefix))
		.map(_.replace(prefix, ""))
		.sorted

	println(result.mkString("[", ", ", "]"))
}
