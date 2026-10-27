class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MyLinkedList() {
    private val head = ListNode(0)
    private var size = 0

    fun get(index: Int): Int {
        if (index >= size) return -1
        var cur = head.next
        for (i in 0 until index) {
            cur = cur?.next
        }
        return cur?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        val node = ListNode(`val`)
        node.next = head.next
        head.next = node
        size++
    }

    fun addAtTail(`val`: Int) {
        val node = ListNode(`val`)
        var cur: ListNode? = head
        while (cur?.next != null) {
            cur = cur.next
        }
        cur?.next = node
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index > size) return
        var cur: ListNode? = head
        for (i in 0 until index) {
            cur = cur?.next
        }
        val node = ListNode(`val`)
        node.next = cur?.next
        cur?.next = node
        size++
    }

    fun deleteAtIndex(index: Int) {
        if (index >= size) return
        var cur: ListNode? = head
        for (i in 0 until index) {
            cur = cur?.next
        }
        cur?.next = cur?.next?.next
        size--
    }
}