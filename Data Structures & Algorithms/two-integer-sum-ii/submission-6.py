class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums) - 1

        while l < r:
            while l< r and nums[l] == nums[l + 1]:
                l += 1

            twoSum = nums[l] + nums[r]
            
            if twoSum == target: 
                return [l + 1, r + 1]
            elif twoSum > target:
                r -= 1
            else:
                l += 1

