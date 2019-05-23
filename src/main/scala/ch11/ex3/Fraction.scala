package ch11.ex3

import scala.math._

class Fraction(n: Int, d: Int) {
	private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
	private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

	def sign(a: Int): Int = if (a > 0) 1 else if (a < 0) -1 else 0

	def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

	def unary_-(): Fraction = {
		Fraction(-num, den)
	}

	def + (that: Fraction): Fraction = {
		Fraction(num * that.den + that.num * den, den * that.den)
	}

	def + (int: Int): Fraction = {
		this + Fraction(int, 1)
	}

	def - (that: Fraction): Fraction = {
		this + -that
	}

	def - (int: Int): Fraction = {
		this + Fraction(-int, 1)
	}

	def * (that: Fraction): Fraction = {
		Fraction(num * that.num, den * that.den)
	}

	def * (int: Int): Fraction = {
		Fraction(num * int, den)
	}

	def / (that: Fraction): Fraction = {
		Fraction(num * that.den, den * that.num)
	}

	def / (int: Int): Fraction = {
		Fraction(num, den * int)
	}

	override def toString: String = num + "/" + den
}

object Fraction {
	def apply(n: Int, d: Int): Fraction = new Fraction(n, d)

	def unapply(arg: Fraction): Option[(Int, Int)] = Some((arg.num, arg.den))
}