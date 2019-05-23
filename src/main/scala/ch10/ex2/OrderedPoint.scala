package ch10.ex2

import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
	def this(p: Point) {
		this(p.x, p.y)
	}
	/*
	returns n where:

		n < 0 when this < that
		n == 0 when this == that
		n > 0 when this > that
	 */
	// (x, y) < (x′, y′), если x < x′ или x = x′ и y < y′
	override def compare(that: Point): Int = {
		if (this.x < that.x) -1
		else if (this.x == that.x) {
			if (this.y < that.y) -1
			else if (this.y == that.y) 0
			else 1
		}
		else 1
	}
}
