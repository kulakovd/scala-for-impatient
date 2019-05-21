package ch8.ex6

class Rectangle(
	private val leftTopPoint: Point,
	private val width: Double,
	private val height: Double
) extends Shape
{
	override def centerPoint: Point = new Point(leftTopPoint.x + width / 2, leftTopPoint.y + height / 2)
}
