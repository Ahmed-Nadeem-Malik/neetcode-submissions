class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key = lambda x : x[1])
        lastEnd = intervals[0][1]
        output = 0

        for i in range(1, len(intervals)):
            start, end = intervals[i]
            if start < lastEnd:
                output += 1
            else:
                lastEnd = end


        return output 

        