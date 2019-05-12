package ch5.ex3

class Time(hrs: Int = 0, min: Int = 0) {
	private val hours = hrs % 24
	private val minutes = min % 60

	def before(other: Time): Boolean = {
		hours < other.hours || (hours == other.hours && minutes < other.minutes)
	}
}
