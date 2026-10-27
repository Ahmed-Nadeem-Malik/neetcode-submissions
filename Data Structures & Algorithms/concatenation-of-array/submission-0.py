class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = []
        count = 0
        while count < 2:
            for i in range(0, n):
                ans.append(nums[i])
            count += 1
        return ans