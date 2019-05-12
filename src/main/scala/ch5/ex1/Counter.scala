package ch5.ex1

class Counter(private var value: Int = 0) {
	def current: Int = value
	def increment(): Unit = {
		if (value < Int.MaxValue)
			value += 1
	}
}