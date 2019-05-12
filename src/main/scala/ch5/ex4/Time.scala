package ch5.ex4

class Time(hrs: Int = 0, min: Int = 0) {
	private val minutes = (hrs % 24) * 60 + (min % 60)

	def before(other: Time): Boolean = {
		minutes < other.minutes
	}
}
