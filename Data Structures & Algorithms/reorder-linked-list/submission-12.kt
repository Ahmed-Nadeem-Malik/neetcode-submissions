/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head == null || head.next == null) return
        var fast: ListNode? = head.next
        var slow: ListNode? = head

        while (fast != null && fast?.next != null) {
            fast = fast?.next?.next
            slow = slow?.next
        }

        var tempCur = slow?.next
        slow?.next = null
        var prev: ListNode? = null
        var cur = tempCur
        while (cur != null) {
            val temp = cur?.next
            cur.next = prev
            prev = cur
            cur = temp
        }

        var first: ListNode? = head
        var second: ListNode? = prev
        while(first != null && second != null) {
            val tmp1 = first?.next
            val tmp2 = second?.next
            first.next = second
            second?.next = tmp1
            first = tmp1
            second = tmp2
        }

    }
}
