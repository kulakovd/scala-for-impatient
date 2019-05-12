package ch5.ex8

class Car(val manufacturer: String, val model: String) {
	private var privateProductionYear: Int = -1 // не должно изменяться
	var registrationNumber = ""

	def productionYear: Int = privateProductionYear

	def this(manufacturer: String, model: String, productionYear: Int) {
		this(manufacturer, model)
		this.privateProductionYear = productionYear
	}

	def this(manufacturer: String, model: String, registrationNumber: String) {
		this(manufacturer, model)
		this.registrationNumber = registrationNumber
	}

	def this(manufacturer: String, model: String, productionYear: Int, registrationNumber: String) {
		this(manufacturer, model)
		this.privateProductionYear = productionYear
		this.registrationNumber = registrationNumber
	}
}
