class Solution:
    def isValid(self, s: str) -> bool:
        hashMap = {
            ')':'(',
            '}':'{',
            ']':'['
        }
        stack = []

        for brac in s:
            if brac not in hashMap:
                stack.append(brac)
            elif  stack and hashMap[brac] == stack[-1]:
                stack.pop()
            else:
                return False
        return not stack