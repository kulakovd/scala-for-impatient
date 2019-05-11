package ch4.ex6

import java.util.Calendar

import scala.collection.mutable

object Ch4_Ex6 extends App {
	val week = mutable.LinkedHashMap(
		"Monday" -> Calendar.MONDAY,
		"Tuesday" -> Calendar.THURSDAY,
		"Wednesday" -> Calendar.WEDNESDAY,
		"Thursday" -> Calendar.THURSDAY,
		"Friday" -> Calendar.FRIDAY,
		"Saturday" -> Calendar.SATURDAY,
		"Sunday" -> Calendar.SUNDAY
	)

	for (k <- week.keySet) print(s"$k ")
}
