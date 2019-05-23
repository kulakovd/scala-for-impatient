package ch11.ex5

import scala.collection.mutable.ArrayBuffer

class Table {
	// add table>tr
	val rows: ArrayBuffer[TableRow] = ArrayBuffer(TableRow())

	def | (string: String): Table = {
		// add td
		rows.last.addCell(string)
		this
	}

	def || (string: String): Table = {
		// add tr>td
		rows.append(TableRow())
		this | string
	}

	override def toString: String = {
		s"<table>${rows.mkString}</table>"
	}
}

object Table {
	def apply(): Table = new Table()
}