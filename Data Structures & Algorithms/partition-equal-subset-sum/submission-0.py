class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        if sum(nums) % 2 != 0:
            return False    

        targetVal = sum(nums) // 2
        cache = [[-1] * (targetVal+1) for i in range(len(nums)+1)]
        

        def backtrack(i, target):
            if i >= len(nums):
                return target == 0
            if target < 0:
                return False
            if cache[i][target]!= -1:
                return cache[i][target]

            cache[i][target] =  backtrack(i+1, target) or  backtrack(i+1, target - nums[i])
            return cache[i][target]

        return backtrack(0, targetVal)
