class Solution:
    def tribonacci(self, n: int) -> int:
        cache = [-1] * (n+1)

        def func(i):
            if i <= 2:
                if i == 0:
                    return 0
                else:
                    return 1
            
            if cache[i] != -1:
                return cache[i]

            cache[i] = func(i-1) + func(i-2) + func(i-3)

            return cache[i]

        return func(n)