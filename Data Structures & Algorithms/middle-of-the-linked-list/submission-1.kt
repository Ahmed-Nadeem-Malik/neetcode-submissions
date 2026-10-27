/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var slow: ListNode? = head
        var fast: ListNode? = head?.next

        while (fast != null) {
            slow = slow?.next
            fast = fast?.next?.next
        }

        return slow
    }
}
