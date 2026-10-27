class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)

        prefix = 1
        for idx, num in enumerate(nums):
            output[idx] = prefix
            prefix *= nums[idx]

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            output[i] *= postfix
            postfix *= nums[i]

        return output






"""
1  2  3  6
1  2  8  48
48 48 24 6

"""
        