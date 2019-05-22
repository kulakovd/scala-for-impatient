package ch10.ex1

import java.awt.geom.Ellipse2D

object Ch10_Ex1 extends App {
	val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike
	println(egg.x, egg.y, egg.width, egg.height)

	egg.translate(10, -10)
	println(egg.x, egg.y, egg.width, egg.height)

	egg.grow(10, 20)
	println(egg.x, egg.y, egg.width, egg.height)
}
