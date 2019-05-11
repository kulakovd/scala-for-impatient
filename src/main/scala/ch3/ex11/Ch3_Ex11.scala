package ch3.ex11

import java.awt.datatransfer._

import scala.collection.JavaConverters.asScalaBuffer
import scala.collection.mutable

object Ch3_Ex11 extends App {
	val flavors: mutable.Buffer[String] = asScalaBuffer(
		SystemFlavorMap.getDefaultFlavorMap()
			.asInstanceOf[SystemFlavorMap]
			.getNativesForFlavor(DataFlavor.imageFlavor)
	)
}
