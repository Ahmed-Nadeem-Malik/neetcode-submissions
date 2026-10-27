class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
            intervals.sort()
            count = 0
            lastEnd = intervals[0][1]
            for start, end in intervals[1:]:
                if start < lastEnd: 
                    lastEnd = min(end, lastEnd)
                    count += 1
                else:
                    lastEnd = end
            return count 