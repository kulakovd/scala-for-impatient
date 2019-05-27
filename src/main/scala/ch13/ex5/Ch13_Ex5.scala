package ch13.ex5

object Ch13_Ex5 extends App {

	println(mkString(Array(48,4,6,4,16,84, "!!!"), sep = ", ", start = "[", end = "]"))

	def mkString(seq: Seq[Any], start: String = "", sep: String = "", end: String = ""): String = {
		val builder = new StringBuilder()
		builder.append(start)
		builder.append(
			seq.reduceLeft(_.toString + sep + _.toString))
		builder.append(end)
		builder.toString()
	}
}
