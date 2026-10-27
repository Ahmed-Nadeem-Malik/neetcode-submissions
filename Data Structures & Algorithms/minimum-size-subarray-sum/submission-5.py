class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        hashSet = {}
        l = 0
        output = float("inf")
        sumVal = 0
        for r in range(len(nums)):
            sumVal += nums[r]
            while sumVal >= target:
                output = min(r - l + 1, output)
                sumVal -= nums[l]
                l += 1

        if output == float("inf"):
            return 0
        return output
