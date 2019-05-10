package ch3.ex4

object Ch3_Ex4 extends App {
	val array = Array(2, 4, -7, 5, 0, -1, 3, -4)
					// положительные идут раньше всех, отрицательные раньше нулей
	val sorted = array.sortWith((a, b) => (a > 0 && b <= 0) || (a < 0 && b == 0))
	println(sorted.mkString(", "))

	val sorted2 = array.filter(_ > 0) ++ array.filter(_ < 0) ++ array.filter(_ == 0)
	println(sorted2.mkString(", "))
}
