package ch14.ex8

object Ch14_Ex8 extends App {
	// (3 × 8) + 2 + (–5) = 21
	val node = Node("+", Node("*", Leaf(3), Leaf(8)), Leaf(2), Node("-", Leaf(5)))
	println(eval(node))

	def eval(tree: Tree): Double = {
		tree match {
			case Leaf(x) => x
			case node: Node =>
				node.op match {
					case "*" => node.children.foldLeft(1.0)(_ * eval(_))
					case "/" => node.children.tail.foldLeft(eval(node.children.head))(_ / eval(_))
					case "+" => node.children.foldLeft(0.0)(_ + eval(_))
					case "-" => node.children.foldLeft(0.0)(_ - eval(_))
				}
		}
	}
}
