package ch6.ex8

object RGB extends Enumeration {
	val Black: RGB.Value = Value(0x000000)
	val Red: RGB.Value = Value(0xff0000)
	val Green: RGB.Value = Value(0x00ff00)
	val Blue: RGB.Value = Value(0x0000ff)
	val Yellow: RGB.Value = Value(0xffff00)
	val Magenta: RGB.Value = Value(0xff00ff)
	val Cyan: RGB.Value = Value(0x00ffff)
	val White: RGB.Value = Value(0xffffff)
}