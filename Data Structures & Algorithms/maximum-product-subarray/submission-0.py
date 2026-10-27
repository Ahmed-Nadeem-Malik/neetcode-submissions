class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        output = nums[0]

        for i in range(len(nums)):
            cur = nums[i]
            output = max(cur, output)
            for j in range(i+1, len(nums)):
                cur *= nums[j]
                output = max(output, cur)

        return output