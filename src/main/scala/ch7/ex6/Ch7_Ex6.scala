package ch7.ex6

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable.{HashMap => ScalaHashMap}

object Ch7_Ex6 extends App {
	val javaHashMap = new JavaHashMap[String, String]()

	javaHashMap.put("key1", "value1")
	javaHashMap.put("key2", "value2")
	javaHashMap.put("key3", "value3")
	javaHashMap.put("key4", "value4")
	javaHashMap.put("key5", "value5")

	val scalaHashMap = new ScalaHashMap[String, String]()
	javaHashMap.forEach((k, v) => scalaHashMap put (k, v))

	println(scalaHashMap.mkString(", "))
}
