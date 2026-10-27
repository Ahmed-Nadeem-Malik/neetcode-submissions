class Solution:
    def isValid(self, s: str) -> bool:
        bmap = {
            ']' : '[',
            '}' : '{',
            ')' : '('
        }
        stack = [] 

        for i in range(len(s)):
            cur = s[i] 
            if cur in bmap:
                if stack and stack[-1] == bmap[cur]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(cur)

        return True if not stack else False



        