class Solution:
    def climbStairs(self, n: int) -> int:
        

        def dfs(i):
            one, two = 1, 1

            while i < n:
                tmp = two
                two = one + two
                one = tmp
                i +=1

            return one

        return dfs(0)


