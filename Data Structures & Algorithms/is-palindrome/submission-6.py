class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ""

        for string in s:
            if string.isalnum():
                clean += string.lower()
            else:
                continue

        l = 0
        r = len(clean) - 1

        while l <= r:
            if clean[l] != clean[r]:
                return False
            else:
                l += 1
                r -= 1

        return True
