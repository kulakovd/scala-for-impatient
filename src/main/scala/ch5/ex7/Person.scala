package ch5.ex7

class Person(val name: String) {
	val firstName: String = name.split(" ").head
	val lastName: String = name.split(" ").last
}


