package ch6.ex6

object PlayingCardSuit extends Enumeration {
	val Diamonds: PlayingCardSuit.Value = Value("♦")
	val Clubs: PlayingCardSuit.Value = Value("♣")
	val Hearts: PlayingCardSuit.Value = Value("♥")
	val Spades: PlayingCardSuit.Value = Value("♠")

	override def toString(): String = {
		this.values.toArray.map(e => s"«$e»").mkString(", ")
	}
}
