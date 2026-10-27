class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null || left == right) return head

        var cur = head
        var prev: ListNode? = null

        for (i in 1 until left) {
            prev = cur
            cur = cur?.next
        }

        val before = prev
        val tail = cur

        prev = null
        var track = right - left + 1

        while (cur != null && track > 0) {
            val temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
            track--
        }

        tail?.next = cur

        if (before != null) before.next = prev else return prev

        return head
    }
}
