package ch7.ex9

import java.lang.System

object Ch7_Ex9 extends App {
	val name = System.getProperty("user.name")
	val password = (if (System.console() != null)
		System.console().readPassword("Пароль: ")
	else
		Console.readLine("Пароль: ")).toString

	if (password.length < 8 || !containsLetter(password) || !containsDigit(password)) {
		println("Слабый пароль")
	} else
		println(s"Здравствуйте, $name")

	def containsLetter(s: String) = {
		s.foldLeft(false)(_ || _.isLetter)
	}

	def containsDigit(s: String) = {
		s.foldLeft(false)(_ || _.isDigit)
	}
}
