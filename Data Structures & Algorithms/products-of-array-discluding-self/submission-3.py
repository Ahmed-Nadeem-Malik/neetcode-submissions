class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod, zeroCount = 1, 0

        for num in nums:
            if num != 0:
                prod *= num
            else:
                zeroCount += 1
        if zeroCount > 1:
            return [0] * len(nums)

        output = []
        for idx, num in enumerate(nums):
            if zeroCount == 1:
                if num == 0:
                    output.append(prod)
                else:
                    output.append(0)

            else:
                output.append(prod//num)

        return output

"""
-1 0 1 2 3

-1 0  0 0 0

3  6  6  0 0 

0  0  6  6  3

"""