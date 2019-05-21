package ch8.ex7

import java.awt.Rectangle

class Square(val x: Int, val y: Int, val width: Int) extends Rectangle(x, y, width, width) {

	def this(width: Int) {
		this(0, 0, width)
	}

	def this() {
		this(0, 0, 0)
	}
}
