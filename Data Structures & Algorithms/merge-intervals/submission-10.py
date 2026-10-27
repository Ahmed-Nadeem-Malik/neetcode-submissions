class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        output = []
        
        for start, end in intervals:
            if output: 
                lastStart, lastEnd = output[-1]
                if start <= lastEnd:
                    output[-1][1] = max(lastEnd, end)
                else:
                    output.append([start, end])
            else:
                output.append([start, end])

        return output
