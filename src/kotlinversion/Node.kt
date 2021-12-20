package kotlinversion

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var currentNode = this
         while (currentNode != null){
             println(currentNode.data)
             currentNode = currentNode.following!!
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        if (h!!.following != null){
            return length(h.following) + 1
        }else{
            return 1
        }
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var sumLength = 0
        var n: Node? = this
        while (n != null) {
            sumLength += n.data
            n = n.following
        }
        return sumLength
    }

    fun deleteNode(head: Node, data: Int): Node? {
        var n: Node?= head
        var preNode = head
        if(n!!.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        while (n != null) {
            if (n.data == data) {
                preNode.following = n.following
                n = null
                return head
            }
            preNode = n
            n = n.following
        }
        return head
    }
}