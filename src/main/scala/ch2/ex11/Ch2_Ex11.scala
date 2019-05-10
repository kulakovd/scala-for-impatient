package ch2.ex11

import java.time.LocalDate

object Ch2_Ex11 extends App {
	val date = date"${2000}-${8}-${12}"
	print(date)

	implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
		def date(args: Any*): LocalDate = {
			if (args.length != 3) {
				throw new IllegalArgumentException("invalid number of arguments")
			}

			for (i <- 1 until sc.parts.length-1) {
				if (sc.parts(i) != "-") {
					throw new IllegalArgumentException("arguments must be separated by '-'")
				}
			}

			var intArgs: Seq[Int] = null
			try {
				intArgs = args.map(e => e.toString.toInt)
			} catch {
				case _: NumberFormatException => throw new IllegalArgumentException("arguments must be integers")
			}

			val year = intArgs.head
			val month = intArgs(1)
			val day = intArgs(2)

			LocalDate.of(year, month, day)
		}
	}
}
