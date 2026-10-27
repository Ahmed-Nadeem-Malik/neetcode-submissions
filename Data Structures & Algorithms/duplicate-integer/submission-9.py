class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        prevVal = 0
        for i in range(1, len(nums)):
            if nums[prevVal] == nums[i]:
                return True
            else:
                prevVal +=1

        return False