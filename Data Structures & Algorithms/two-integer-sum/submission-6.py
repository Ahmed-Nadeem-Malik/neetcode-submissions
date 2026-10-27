class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for num in range(len(nums)):
            aim = target - nums[num]
            if aim in hashMap:
                return [hashMap[aim], num]
            else:
                hashMap[nums[num]] = num

        return [0, 0]