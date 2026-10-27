class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxNum = nums[0]
        curSum = 0

        for i in range(len(nums)):
            curSum = max(0, curSum)
            curSum += nums[i]
            maxNum = max(maxNum, curSum)
        
        return maxNum