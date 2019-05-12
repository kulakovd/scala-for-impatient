package ch6.ex7

object PlayingCardSuit extends Enumeration {
	val Diamonds: PlayingCardSuit.Value = Value("♦")
	val Clubs: PlayingCardSuit.Value = Value("♣")
	val Hearts: PlayingCardSuit.Value = Value("♥")
	val Spades: PlayingCardSuit.Value = Value("♠")

	def isRed(suit: PlayingCardSuit.Value): Boolean =
		suit == this.Hearts || suit == this.Diamonds

	override def toString(): String = {
		this.values.toArray.map(e => s"«$e»").mkString(", ")
	}
}
