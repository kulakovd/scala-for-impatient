package ch10.ex4

object Ch10_Ex4 extends {override val key = -3} with App with ConsoleLogger with TimestampLogger  with CryptoLogger {
	log("Сообщение Message 123")
}