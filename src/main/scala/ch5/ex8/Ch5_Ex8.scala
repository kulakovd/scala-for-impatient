package ch5.ex8

object Ch5_Ex8 extends App {
	val car = new Car("Audi", "A6", "A001AA196")

	println(car.manufacturer)
	println(car.model)
	println(car.productionYear)
	println(car.registrationNumber)
}
