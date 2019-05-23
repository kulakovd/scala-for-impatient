package ch10.ex11

import java.io.FileInputStream

object Ch10_Ex11 extends App {
	val iterable = new IterableInputStream(new FileInputStream("src/res/ch9ex4.txt"))
	val i = iterable.iterator
	while (i.hasNext) {
		print(i.next().toChar)
	}
}
