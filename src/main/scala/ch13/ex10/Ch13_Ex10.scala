package ch13.ex10

import java.util.TimeZone

object Ch13_Ex10 extends App {
	val timeZones = TimeZone.getAvailableIDs
	val grouped = timeZones.groupBy(_.split("/")(0))
	val max = grouped.maxBy(e => e._2.length)
	println(max._1 -> max._2.mkString("[", ", ", "]"))
	println(max._2.length)
}
