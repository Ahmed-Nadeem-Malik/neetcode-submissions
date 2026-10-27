"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        intervals.sort(key=lambda x: x.start)

        for i in range(1, len(intervals)):
            lastI = intervals[i - 1]
            curI = intervals[i]

            if lastI.end > curI.start:
                return False
            else:
                continue

        return True 
