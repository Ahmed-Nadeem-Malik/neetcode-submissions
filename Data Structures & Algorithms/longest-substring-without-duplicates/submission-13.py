class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        output = 0
        l = 0
        hashSet = set()
       
        for r in range(len(s)):
            while s[r] in hashSet:
                hashSet.remove(s[l])
                l += 1
            
            hashSet.add(s[r])
            output = max(output, r - l + 1) 

        return output


