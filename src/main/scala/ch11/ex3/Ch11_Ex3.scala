package ch11.ex3

object Ch11_Ex3 extends App {
	println(Fraction(1, 2) + Fraction(3, 4))
	println(Fraction(1, 2) - Fraction(3, 4))
	println(Fraction(1, 2) * Fraction(3, 4))
	println(Fraction(1, 2) / Fraction(3, 4))

	val Fraction(a, b) = Fraction(44, 2)
	println(a, b)
}
