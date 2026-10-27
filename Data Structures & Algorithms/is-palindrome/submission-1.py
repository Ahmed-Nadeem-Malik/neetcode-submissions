class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        clean_s = ""
        for i in range(len(s)):
            if s[i].isalnum():
                clean_s +=s[i].lower()
        return clean_s == clean_s[::-1]