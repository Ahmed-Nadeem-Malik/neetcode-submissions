class Solution:
    def isValid(self, s: str) -> bool:
        hashMap = {
            ')' : '(',
            '}' : '{',
            ']' : '[',
        }

        stack = []

        for ch in s:
            if ch in hashMap:
                if stack and stack[-1] == hashMap[ch]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(ch)

        if stack:
            return False

        return True