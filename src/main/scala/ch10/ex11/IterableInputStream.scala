package ch10.ex11

import java.io.InputStream

class IterableInputStream(inputStream: InputStream) extends InputStream with Iterable[Byte] {

	override def read: Int = inputStream.read

	override def iterator: Iterator[Byte] = {
		new Iterator[Byte] {
			override def hasNext: Boolean = inputStream.available > 0

			override def next(): Byte = inputStream.read.toByte
		}
	}
}
