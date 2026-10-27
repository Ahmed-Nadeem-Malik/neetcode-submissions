# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        node = dummy = ListNode(0, None)

        carry = 0
        while l1 or l2 or carry:
            if l1:
                l1Val = l1.val
            else:
                l1Val = 0
            if l2:
                l2Val = l2.val
            else:
                l2Val = 0
                 
            sumVal = l1Val + l2Val + carry
            carry = sumVal // 10
            sumVal = sumVal % 10
            node.next = ListNode(sumVal)

            node = node.next
            if l1:
                l1 = l1.next
            else:
                None
            if l2:
                l2 = l2.next
            else:
                None
                
        return dummy.next