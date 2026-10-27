class Solution:
    def climbStairs(self, n: int) -> int:
        cache = [-1] * n
        def steps(i):
            if i == n:
                return 1
            if i > n:
                return 0
            if cache[i] != -1:
                return cache[i]
            
            cache[i] = steps(i+1) + steps(i+2)
            
            return cache[i]

        return steps(0)