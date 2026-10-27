class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chSet = set()
        L = 0
        maxVal = 0

        for R in range(len(s)):
            while s[R] in chSet:
                chSet.remove(s[L])
                L +=1
            chSet.add(s[R])
            maxVal = max(maxVal, R - L +1)
        return maxVal