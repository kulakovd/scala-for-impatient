package ch8.ex8

class Person(val name: String) {
	override def toString = s"${getClass.getName}[name=$name]"
}
