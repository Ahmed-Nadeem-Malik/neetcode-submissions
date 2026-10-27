class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chSet = set()
        L = 0
        output = 0
        
        for R in range(len(s)):
            while s[R] in chSet:
                chSet.remove(s[L])
                L += 1
            chSet.add(s[R])
            output = max(output, R - L + 1)

        return output