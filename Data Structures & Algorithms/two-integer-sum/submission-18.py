class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for idx, num in enumerate(nums):
            aim = target - num
            if aim in hashMap:
                return [hashMap[aim], idx]
            else:
               hashMap[num] = idx


        