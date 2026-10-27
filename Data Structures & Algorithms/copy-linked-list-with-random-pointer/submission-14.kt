/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        if (head == null) return null

        var l1: Node? = head
        while (l1 != null) {
            val l2 = Node(l1.`val`)
            l2.next = l1.next
            l1.next = l2
            l1 = l2.next
        }

        val newHead = head.next
        
        l1 = head
        while (l1 != null) {
            if (l1.random != null) l1?.next?.random = l1?.random?.next 
            l1 = l1?.next?.next
        }

        l1 = head
        while (l1 !=null) {
            val l2 = l1.next
            l1.next = l2?.next
            if (l2?.next != null) l2.next = l2?.next?.next
            l1 = l1.next
        }
        return newHead
    }
}
