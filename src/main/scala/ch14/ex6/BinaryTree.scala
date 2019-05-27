package ch14.ex6

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree