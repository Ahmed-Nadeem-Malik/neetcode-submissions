class Solution:
    def isValid(self, s: str) -> bool:
        hashMap = {
            ')':'(',
            ']':'[',
            '}':'{',
        }

        stack = []

        for b in s:
            if b in hashMap:
                if stack and hashMap[b] == stack[-1]:
                    stack.pop()
                    continue
                else:
                    return False
            else:
                stack.append(b)

        if not stack:
            return True
        return False

