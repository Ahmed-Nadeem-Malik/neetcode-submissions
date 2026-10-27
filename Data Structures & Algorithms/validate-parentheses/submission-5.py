class Solution:
    def isValid(self, s: str) -> bool:
        bracDict = {")": "(", "}": "{", "]": "["}

        if len(s) % 2 != 0:
            return False

        stack = []
        for ch in s:
            if ch in bracDict:  # closing
                if not stack or stack[-1] != bracDict[ch]:
                    return False
                stack.pop()
            else:  # opening
                stack.append(ch)

        return not stack

"""
({[]})
({[
"""
        