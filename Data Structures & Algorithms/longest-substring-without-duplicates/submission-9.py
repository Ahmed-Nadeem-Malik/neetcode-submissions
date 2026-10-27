class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        output = 0
        chSet = set()
        l = 0
        
        for r in range(len(s)):
            while l < r and s[r] in chSet:
                chSet.remove(s[l])
                l += 1

            chSet.add(s[r])
            output = max(output, r - l + 1)

        return output 


            
        