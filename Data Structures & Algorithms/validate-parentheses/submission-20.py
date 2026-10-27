class Solution:
    def isValid(self, s: str) -> bool:
        hashMap = {
            ')':'(',
            ']':'[',
            '}':'{'
        }
        stack = []

        for b in s:
            if b in hashMap:
                if stack and stack[-1] == hashMap[b]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(b)

        if stack:
            return False
        return True

