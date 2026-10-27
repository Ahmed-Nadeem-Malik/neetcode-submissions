class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for idx, num in enumerate(nums):
            aim = target - num
            if num in hashMap:
                return [hashMap[num], idx]
            hashMap[aim] = idx
