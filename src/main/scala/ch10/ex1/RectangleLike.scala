package ch10.ex1

import java.awt.geom.Ellipse2D

trait RectangleLike {
	this: Ellipse2D =>

	def translate(dx: Int, dy: Int): Unit = {
		setFrame(getX + dx, getY + dy, getWidth, getHeight)
	}

	def grow(h: Int, v: Int): Unit = {
		setFrame(getX - h, getY - v, getWidth + 2*h, getHeight + 2*v)
	}
}
