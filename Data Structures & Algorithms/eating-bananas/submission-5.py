class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        maxK = max(piles)

        l = 1
        r = maxK

        output = r

        while l <= r:
            k = (l + r) // 2
            localH = 0
            for p in piles:
                localH += math.ceil(float(p) / k)
            if localH <= h:
                output = k
                r = k - 1
            else:
                l = k + 1

        return output 


"""
[1, 4, 3, 2]
1b, 4b, 3b, 2b
h = max time you can eat b
k = b per hour based on max h

max = 4

1, 2 .. 4

try 4 // 2 = 2 answer

"""