class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)
        prefixVal = 1 
        for i in range(len(nums)):
            output[i] = prefixVal
            prefixVal *= nums[i]

        postfixVal = 1
        for i in range(len(nums) - 1, -1, -1):
            output[i] *= postfixVal
            postfixVal *= nums[i]

        return output





"""
-1 0 1 2 3

-1 0  0 0 0

3  6  6  0 0 

0  0  6  6  3

"""