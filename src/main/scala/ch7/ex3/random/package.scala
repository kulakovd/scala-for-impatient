package ch7.ex3

package object random {
	private[random] val a: Int = 1664525
	private[random] val b: Int = 1013904223
	private[random] val n: Int = 32
	private[random] var previous: Int = 0

	private[random] def next = {
		val next = previous * a + b % math.pow(2, n).toInt
		previous = next
		next
	}

	def setSeed(seed: Int): Unit = { previous = seed }

	def nextInt(): Int = next

	def nextDouble(): Double = next / (math.pow(2, n) - 1)
}
