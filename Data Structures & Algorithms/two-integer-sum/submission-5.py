class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        for i in range(len(nums)):
            aim = target - nums[i]
            if aim in hashMap:
                return [hashMap[aim], i]
            else:
                hashMap[nums[i]] = i
