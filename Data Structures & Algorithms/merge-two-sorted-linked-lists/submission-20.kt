/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var cur1 = list1
        var cur2 = list2
        val dummy = ListNode(0)
        var node: ListNode? = dummy

        while (cur1 != null && cur2 != null) {
            if (cur1.`val` > cur2.`val`) {
                node?.next = cur2
                cur2 = cur2.next
            } else {
                node?.next = cur1
                cur1 = cur1.next 
            }
            node = node?.next
        }
        node?.next = cur1 ?: cur2
        return dummy.next
    }
}
