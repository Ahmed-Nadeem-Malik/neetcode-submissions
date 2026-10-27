class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        hashMap = {
            ')' : '(',
            '}' : '{',
            ']' : '[',
        }
        for b in s:
            if b not in hashMap:
                stack.append(b)
            else:
                if stack and hashMap[b] == stack[-1]:
                    stack.pop()
                else:
                    return False


        if stack:
            return False

        return True



        