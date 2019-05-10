package ch2.ex10

object Ch2_Ex10 extends App {
	def pow(x: Int, n: Int): Double = {
		if (n > 0) {
			if (n % 2 == 0) {
				val y = pow(x, n/2)
				y * y
			} else {
				x * pow(x, n-1)
			}
		} else if (n < 0) {
			1 / pow(x, -n)
		} else {
			1
		}
	}

	println(pow(2, 8))
	println(pow(2, 7))
	println(pow(2, -1))
	println(pow(2, 0))
}
