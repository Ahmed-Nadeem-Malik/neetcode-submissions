class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        output = []
        stack = []
        
        def dfs(openB, closedB):
            if openB == closedB == n:
                output.append("".join(stack))
                return 

            if openB < n:
                stack.append("(")
                dfs(openB + 1, closedB)
                stack.pop()
            if closedB < openB:
                stack.append(")")
                dfs(openB, closedB + 1)
                stack.pop()

        dfs(0, 0)
        return output 

            