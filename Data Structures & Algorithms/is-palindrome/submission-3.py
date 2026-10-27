class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleanS = ""
        for ch in s:
            if ch.isalnum():
                cleanS += ch.lower()
            else:
                continue

        L = 0
        R = len(cleanS) -1

        while L <= R:
            if cleanS[L] != cleanS[R]:
                return False
            else:
                L+=1
                R-=1

        return True
