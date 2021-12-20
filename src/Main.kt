import kotlinversion.Node

class Main {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            // Example
            val node = Node(4)
            node.appendToEnd(5)
            node.appendToEnd(6)
            node.appendToEnd(7)
            // End of Example
            println("Sum - ${node.sumOfNodes()}")
            println("Length - ${node.length(node)}")
            node.printNodes()


        }
    }
}