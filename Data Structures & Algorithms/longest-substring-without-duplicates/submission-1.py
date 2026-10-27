class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxSub = 0
        for i in range(len(s)):
            setCh = set()
            total = 0
            for j in range(i, len(s)):
                if s[j] in setCh:
                        break
                setCh.add(s[j])
                total+=1
                if total > maxSub:
                    maxSub = total
        return maxSub

