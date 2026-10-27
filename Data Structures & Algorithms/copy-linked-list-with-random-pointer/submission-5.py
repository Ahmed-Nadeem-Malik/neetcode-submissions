"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        oldToNew = {None : None}

        cur1 = head

        while cur1:
            new = Node(cur1.val)
            oldToNew[cur1] = new
            cur1 = cur1.next

        cur2 = head
        while cur2:
            new = oldToNew[cur2]
            new.next = oldToNew[cur2.next]
            new.random = oldToNew[cur2.random]
            cur2 = cur2.next

        return oldToNew[head]
        