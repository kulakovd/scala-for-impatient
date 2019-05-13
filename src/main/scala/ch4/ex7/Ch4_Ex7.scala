package ch4.ex7

object Ch4_Ex7 extends App {
	val props = System.getProperties

	var maxLength = 0

	props.keySet().forEach(k => {
		val len = k.toString.length
		if (len > maxLength) {
			maxLength = len
		}
	})

	props.forEach((k, v) => {
		val whitespaces = " " * (maxLength - k.toString.length)
		println(s"$k$whitespaces | $v")
	})
}
