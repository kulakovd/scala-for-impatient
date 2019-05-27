package ch14.ex7

object Ch14_Ex7 extends App {
	val node = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
	println(leafSum(node))

	def leafSum(tree: Tree): Int = {
		tree match {
			case Leaf(x) => x
			case node: Node => node.children.foldLeft(0)((sum, leaf) => sum + leafSum(leaf))
		}
	}
}
