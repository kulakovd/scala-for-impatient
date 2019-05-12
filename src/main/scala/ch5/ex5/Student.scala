package ch5.ex5

import scala.beans.BeanProperty

class Student {
	@BeanProperty
	var name: String = ""
	@BeanProperty
	var id: Long = 0
}