package ch6.ex2

object InchesToCentimeters extends UnitConversion {
	def apply(inches: Double): Double = inches * 2.54
}
