class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        output = 0
        chSet = set()
        for r in range(0, len(s)):
            while s[r] in chSet:
                chSet.remove(s[l])
                l += 1
            chSet.add(s[r])
            output = max(output, r - l + 1)

        return output
            