package ch10.ex4

trait ConsoleLogger extends Logger {
	def log(msg: String): Unit = println(msg)
}
