package ch6.ex2

object GallonsToLiters extends UnitConversion {
	def apply(gallons: Double): Double = gallons * 3.785
}
