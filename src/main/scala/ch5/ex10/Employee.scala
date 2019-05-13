package ch5.ex10

class Employee {
	var name = "John Q. Public"
	var salary = 0.0

	def this(name: String, salary: Double) = {
		this()
		this.name = name
		this.salary = salary
	}
}
