class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for i in range(len(operations)):
            sign = operations[i]
            if sign == "+":
                stack.append(stack[-1] + stack[-2])
            elif sign == 'D':
                stack.append(stack[-1] * 2)
            elif sign == "C":
                stack.pop()
            else:
                stack.append(int(sign))
        sumVal = 0
        for x in stack:
            sumVal += int(x)

        return sumVal
        