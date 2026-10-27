class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefix = { 0 : 1}
        output = 0
        curSum = 0

        for num in nums:
            curSum += num 
            diff = curSum - k

            output += prefix.get(diff, 0)
            prefix[curSum] = 1 + prefix.get(curSum, 0)

        return output
        