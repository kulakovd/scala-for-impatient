package ch10.ex2

import java.awt.Point

object Ch10_Ex2 extends App {
	assert(new OrderedPoint(2, 2).compare(new Point(2, 2)) == 0)
	assert(new OrderedPoint(3, 2).compare(new Point(2, 2)) == 1)
	assert(new OrderedPoint(1, 2).compare(new Point(2, 2)) == -1)
	assert(new OrderedPoint(5, 0).compare(new Point(5, 2)) == -1)
	assert(new OrderedPoint(5, 3).compare(new Point(5, 2)) == 1)
}
