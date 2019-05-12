package ch5.ex9

object Ch5_Ex9 extends App {
	val car = new Car("Audi", "A6", "A001AA196")

	println(car.getManufacturer)
	println(car.getModel)
	println(car.getProductionYear)
	println(car.getRegistrationNumber)
}
