class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        chSet = set()
        output = 0

        for r in range(len(s)):
            while s[r] in chSet:
                chSet.remove(s[l])
                l+= 1
            chSet.add(s[r])
            output = max(output, r - l + 1)

        return output
            