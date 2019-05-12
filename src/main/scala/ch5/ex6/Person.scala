package ch5.ex6

class Person(private var privateAge: Int = 0) {
	 if (privateAge < 0) privateAge = 0

	def age: Int = privateAge
	def age_=(newValue: Int) {
		if (newValue > privateAge) privateAge = newValue; // Нельзя сделать моложе
	}
}