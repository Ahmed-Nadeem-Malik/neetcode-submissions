class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n <= 0:
            return False
        res = 1
        while  res < n:
            res *= 2
        return res == n 