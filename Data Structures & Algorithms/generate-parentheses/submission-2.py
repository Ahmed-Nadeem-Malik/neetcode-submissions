class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack, output = [], []

        def backtrack(openB, closedB):
            if openB == closedB == n:
                output.append(''.join(stack))
                return

            if openB < n:
                stack.append("(")
                backtrack(openB + 1, closedB)
                stack.pop()
            
            if closedB < openB:
                stack.append(')')
                backtrack(openB, closedB + 1)
                stack.pop()

        backtrack(0, 0)
        return output