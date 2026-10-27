class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashSet = {}

        for i, num in enumerate(nums):
            aim = target - num
            if aim in hashSet:
                return [hashSet[aim], i]
            else:
                hashSet[num] = i
