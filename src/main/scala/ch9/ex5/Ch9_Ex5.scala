package ch9.ex5

import java.io.PrintWriter

object Ch9_Ex5 extends App {
	val out = new PrintWriter("src/res/ch9ex5.txt")

	for (i <- 0 to 20) {
		val p = math.pow(2, i)
		out.println(f"$p%7.0f\t${1/p}")
	}

	out.close()
}
