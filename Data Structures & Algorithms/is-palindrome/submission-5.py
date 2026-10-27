class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ""

        for ch in s:
            if ch.isalnum():
                clean += ch.lower()

        L = 0
        R = len(clean) - 1

        while L <= R:
            if clean[L] != clean[R]:
                return False
            L += 1
            R -= 1

        return True
        
