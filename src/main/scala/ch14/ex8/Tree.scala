package ch14.ex8

sealed abstract class Tree

case class Leaf(value: Int) extends Tree

case class Node(op: String, children: Tree*) extends Tree