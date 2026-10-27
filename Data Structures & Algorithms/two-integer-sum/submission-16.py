class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]
        
        return []
        """

        hashMap = {}
        for idx, num in enumerate(nums):
            aim = target - num
            if aim in hashMap:
                return [hashMap[aim], idx]
            else:
                hashMap[num] = idx


