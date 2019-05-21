package ch8.ex4

object Ch8_Ex4 extends App {
	val bundle2items = new Bundle("Bundle with 2 items",
		new SimpleItem(61.1, "Item 1"),
		new SimpleItem(5.41, "Item 2"),
	)

	println(bundle2items.price)
	println(bundle2items.description)
	println()

	val emptyBundle = new Bundle("Bundle with no items")
	println(emptyBundle.price)
	println(emptyBundle.description)
}
