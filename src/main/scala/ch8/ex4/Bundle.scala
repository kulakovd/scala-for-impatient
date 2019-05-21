package ch8.ex4

import scala.collection.mutable.ArrayBuffer

class Bundle(override val description: String, bundleItems: Item*) extends Item {
	private val items = new ArrayBuffer[Item]
	this.items.append(bundleItems: _*)

	override lazy val price: Double = items.foldLeft(0.0)(_ + _.price)
}
