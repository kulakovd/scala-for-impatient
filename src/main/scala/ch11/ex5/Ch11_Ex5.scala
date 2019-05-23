package ch11.ex5

object Ch11_Ex5 extends App {
	val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
	println(table)
}
