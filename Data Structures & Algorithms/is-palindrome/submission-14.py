class Solution:

    def isAlpha(self, s):
        charToNum = ord(s)
        return (ord('A') <= charToNum <= ord('Z') or ord('a') <= charToNum <= ord('z'))
    
    def isNum(self, s):
        charToNum = ord(s)
        return ord('0') <= charToNum <= ord('9')

    def alphaNum(self, s):
        return self.isAlpha(s) or self.isNum(s)


    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        while l < r:
            while l < r and not self.alphaNum(s[l]):
                l += 1
            while l < r and not self.alphaNum(s[r]):
                r -= 1 
            if s[l].lower() != s[r].lower():
                return False

            l += 1
            r -= 1

        return True

        