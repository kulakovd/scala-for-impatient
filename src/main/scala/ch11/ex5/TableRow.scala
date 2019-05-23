package ch11.ex5

import scala.collection.mutable.ArrayBuffer

class TableRow {
	val cells = new ArrayBuffer[String]

	def addCell(cell: String): Unit = {
		cells.append(cell)
	}

	override def toString: String = {
		s"<tr>${cells.map(str => s"<td>$str</td>").mkString}</tr>"
	}
}

object TableRow {
	def apply(): TableRow = new TableRow()
}
