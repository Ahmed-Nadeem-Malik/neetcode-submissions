class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        curS = 0
        for ch in t:
            if curS >= len(s):
                return True
            if ch == s[curS]:
                curS += 1
        if curS >= len(s):
            return True
        return False