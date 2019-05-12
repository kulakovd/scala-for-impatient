package ch6.ex2

object MilesToKilometers extends UnitConversion {
	def apply(miles: Double): Double = miles * 1.609
}
