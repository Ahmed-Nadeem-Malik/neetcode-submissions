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
        stack = []

        for i in intervals:
            s = i.start
            e = i.end
            if stack and stack[-1].end > s:
                return False
            stack.append(i)
            

        return True
