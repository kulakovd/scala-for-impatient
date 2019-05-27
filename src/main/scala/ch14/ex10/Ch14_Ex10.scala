package ch14.ex10

import math._

object Ch14_Ex10 extends App {
	def f(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

	def g(x: Double) = if (x >= 0) Some(sqrt(x)) else None

	val h = compose(f, g) // // h(x) должна быть g(f(x))

	println(h(0), h(1), h(2))

	def compose(fun1: Double => Option[Double], fun2: Double => Option[Double]): Double => Option[Double] = {
		val h: Double => Option[Double] = (x: Double) => {
			fun1(x) match {
				case Some(a) => fun2(a) match {
						case f2: Some[Double] => f2
						case None => None
					}
				case None => None
			}
		}

		h
	}
}
