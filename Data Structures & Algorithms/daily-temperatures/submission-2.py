class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        output = [0] * len(temperatures)
        stack = []

        for idx, temp in enumerate(temperatures):
            while stack and temp > stack[-1][0]:
                sT, sI = stack.pop()
                output[sI] = idx - sI
            stack.append((temp, idx))
        return output