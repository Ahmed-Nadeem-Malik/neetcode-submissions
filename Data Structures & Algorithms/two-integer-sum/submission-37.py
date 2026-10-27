class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numToIndex = {}
        for i in range(0, len(nums)): 
            cur = nums[i]
            bullseye = target - cur
            if bullseye in numToIndex:
                return [numToIndex[bullseye], i]
            numToIndex[cur] = i
        