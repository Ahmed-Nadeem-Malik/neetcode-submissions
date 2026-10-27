class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()

        L, R = 0, 1

        while R < len(nums) -1:
            if nums[L] == nums[R]:
                L += 2
                R += 2
            else:
                return nums[L]

        return nums[L]