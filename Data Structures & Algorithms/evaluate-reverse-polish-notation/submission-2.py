class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        val = 0
        for token in tokens:
            if token == '+':
                stack.append(stack.pop() + stack.pop())
            elif token == '-':
                b = stack.pop()
                a = stack.pop()
                stack.append(a - b)
            elif token == '/':
                b = stack.pop()
                a = stack.pop()
                stack.append(int(float(a) / b))
            elif token == '*':
                stack.append(stack.pop() * stack.pop())
            else:
                stack.append(int(token))

        return stack[0]