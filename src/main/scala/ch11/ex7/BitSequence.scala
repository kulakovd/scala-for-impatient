package ch11.ex7

import math.abs

class BitSequence(private var bits: Long) {
	def this() {
		this(0)
	}

	def apply(pos: Int): Int = {
		abs(((bits >> pos) % 2).toInt)
	}
	
	def update(pos: Int, bit: Long): Unit = {
		val mask = bit << pos
		bits = if (bit == 1) bits ^ mask else bits & mask
	}

	override def toString: String = {
		var outputBits = bits
		val outputBuilder = new StringBuilder
		for (i <- 1 to 64) {
			outputBuilder.append(abs(outputBits % 2))
			outputBits = outputBits >> 1
		}
		outputBuilder.reverse.toString()
	}
}

object BitSequence {
	def apply(): BitSequence = new BitSequence()
	def apply(bits: Long): BitSequence = new BitSequence(bits: Long)
}