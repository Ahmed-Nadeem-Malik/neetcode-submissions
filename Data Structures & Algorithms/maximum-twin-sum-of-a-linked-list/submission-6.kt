class Solution {
    fun pairSum(head: ListNode?): Int {
        var slow = head
        var fast = head

        // Find the start of the second half
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // Reverse the second half
        var prev: ListNode? = null
        var cur = slow

        while (cur != null) {
            val temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp
        }

        // Compare first half with reversed second half
        var first = head
        var second = prev
        var max = Int.MIN_VALUE

        while (second != null) {
            max = maxOf(max, first!!.`val` + second.`val`)
            first = first.next
            second = second.next
        }

        return max
    }
}