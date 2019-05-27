package ch14.ex6

object Ch14_Ex6 extends App {
	val node = Node(Node(Leaf(12), Leaf(25)), Leaf(81))
	println(leafSum(node))

	def leafSum(tree: BinaryTree): Int = {
		tree match {
			case Leaf(x) => x
			case node: Node => leafSum(node.left) + leafSum(node.right)
		}
	}
}
