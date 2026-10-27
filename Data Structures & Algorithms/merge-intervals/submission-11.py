class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        stack = [intervals[0]]

        for start, end in intervals:
            lastEnd =  stack[-1][1]

            if start <= lastEnd:
                stack[-1][1] = max(lastEnd, end)

            else:
                stack.append([start, end])

        return stack
        
        