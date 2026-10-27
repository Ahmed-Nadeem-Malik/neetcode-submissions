class Solution:
    def climbStairs(self, n: int) -> int:
        
        def steps(i):
            if i == n:
                return 1
            if i > n:
                return 0
            
            return steps(i+1) + steps(i+2)
            
        return steps(0)