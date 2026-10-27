class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashSet = {}

        for i in range(len(nums)):
            aim = target - nums[i]
            if aim in hashSet:
                return [hashSet[aim], i]
            hashSet[nums[i]] = i

        