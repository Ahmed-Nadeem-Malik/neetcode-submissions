/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun pairSum(head: ListNode?): Int {
        val listVer = mutableListOf<Int>()

        var curr = head

        while (curr != null) {
            listVer.add(curr.`val`)
            curr = curr.next
        }

        var l = 0
        var r = listVer.size - 1
        var max = Int.MIN_VALUE

        while (l < r) {
            max = maxOf(max, listVer[l] + listVer[r])
            l++
            r--
        }

        return max
    }
}