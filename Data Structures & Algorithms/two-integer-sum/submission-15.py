class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for idx, num in enumerate(nums):
            need = target - num
            if need in hashMap:
                return [hashMap[need], idx]
            else:
                hashMap[num] = idx

