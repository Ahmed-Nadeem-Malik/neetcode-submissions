/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return head
        var dummy = ListNode(0)
        dummy.next = head
        var prev = dummy 
        var cur = head

        while (cur != null && cur.next != null) {
            var next = cur?.next?.next
            var second = cur?.next

            second?.next = cur
            cur.next = next
            prev.next = second
            
            prev = cur
            cur = next
        }

        return dummy.next
        


    }
}
