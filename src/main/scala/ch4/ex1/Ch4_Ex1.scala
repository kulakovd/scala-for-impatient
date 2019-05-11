package ch4.ex1

object Ch4_Ex1 extends App {
	val prices = Map("Стол" -> 1000, "Пылесос" -> 3200, "Книга" -> 600)
	val discounts = for ((k, v) <- prices) yield (k, v * 0.9)

	println(prices.mkString("(", ", ", ")"))
	println(discounts.mkString("(", ", ", ")"))
}
