package ch14.ex7

sealed abstract class Tree

case class Leaf(value: Int) extends Tree

case class Node(children: Tree*) extends Tree