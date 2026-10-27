# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        cur = dummy

        N = 0
        while cur:
            cur = cur.next
            N += 1
        
        nodeBefore = N - n - 1

        cur = dummy
        count = 0
        while count != nodeBefore:
            cur = cur.next
            count += 1

        cur.next = cur.next.next

        return dummy.next 

        