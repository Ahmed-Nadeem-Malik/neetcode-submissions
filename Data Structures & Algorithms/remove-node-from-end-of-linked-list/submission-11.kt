/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy: ListNode? = ListNode(0).apply {next = head}
        var left: ListNode? = dummy
        var right: ListNode? = head

        var count = n
        while (count > 0) {
            right = right?.next
            count--
        }
        
        while (right != null) {
            right = right?.next
            left = left?.next
        }

        left?.next = left?.next?.next

        return dummy?.next
    }
}
