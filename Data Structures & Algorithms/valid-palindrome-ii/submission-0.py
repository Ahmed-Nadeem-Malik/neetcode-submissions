class Solution:
    def validPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        while l < r:
            if s[l] != s[r]:
                lSkip = s[l+1 : r + 1]
                rSkip = s[l : r]
                return lSkip == lSkip[::-1] or rSkip == rSkip[::-1]
            
            l += 1
            r -= 1

        return True