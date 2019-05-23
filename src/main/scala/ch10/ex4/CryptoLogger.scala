package ch10.ex4

import scala.collection.immutable.NumericRange

trait CryptoLogger extends Logger {
	val key = 3

	abstract override def log(msg: String): Unit = {
		super.log(encrypt(msg))
	}

	def encrypt(text: String): String = {
		val ruLower = 'а' to 'я'
		val ruUpper = 'А' to 'Я'

		val enLower = 'a' to 'z'
		val enUpper = 'A' to 'Z'

		text.map {
			case c@ch if ruLower.contains(c) => encryptChar(ch, ruLower)
			case c@ch if ruUpper.contains(c) => encryptChar(ch, ruUpper)
			case c@ch if enLower.contains(c) => encryptChar(ch, enLower)
			case c@ch if enUpper.contains(c) => encryptChar(ch, enUpper)
			case c => c
		}
	}

	def encryptChar(c: Char, alphabet: NumericRange.Inclusive[Char]): Char = {
		var res = c + key

		if (res < alphabet.start)
			res += alphabet.length
		else if (res > alphabet.end)
			res -= alphabet.length

		res.toChar
	}
}
