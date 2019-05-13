package ch7.ex1

object Ch7_Ex1 extends App {
	import ch7.ex1.com.horstmann.impatient._

	Obj1()
	Obj2()
}

package com.horstmann {
	object Obj {
		def apply(): Unit = println("!obj")
	}
}

package com.horstmann.impatient {
	// придется импортировать
	import ch7.ex1.com.horstmann.Obj

	object Obj1 {
		def apply(): Unit = Obj()
	}
}

package com {
	package horstmann {
		package impatient {
			object Obj2 {
				def apply(): Unit = Obj()
			}
		}
	}
}