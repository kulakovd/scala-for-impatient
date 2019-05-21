package ch8.ex8

class SecretAgent(codename: String) extends Person(codename) {
	override val name = "secret" // Скрыть имя ...
	override val toString = "secret" // ... и имя класса
}