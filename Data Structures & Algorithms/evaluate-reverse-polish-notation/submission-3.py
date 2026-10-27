class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for x in tokens:
            if x == '+':
              stack.append(stack.pop() + stack.pop())
            elif x == '-':
                secondVal = stack.pop()
                firstVal = stack.pop()
                stack.append(firstVal - secondVal)
            elif x == '*':
                stack.append(stack.pop() * stack.pop())
            elif x == '/':
                secondVal = stack.pop()
                firstVal = stack.pop()
                stack.append(int(firstVal / secondVal))
            else:
                stack.append(int(x))

        return stack[0]
            