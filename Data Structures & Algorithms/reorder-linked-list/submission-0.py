# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head:
            return

        nodeArr = []
        output = []
        curr = head
        while curr:
            nodeArr.append(curr)
            curr = curr.next


        L, R = 0, len(nodeArr) - 1 

        while L <= R:
            output.append(nodeArr[L])
            L += 1
            output.append(nodeArr[R])
            R -=1

        root = output[0]
        for i in range(0, len(output) - 1):
            output[i].next = output[i+1]

        output[-1].next = None

        return None

