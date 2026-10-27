class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        output = []

        def dfs(i, substring, curSum):
            if curSum == target:
                output.append(substring.copy())
                return

            if i >= len(nums) or curSum > target:
                return 

            substring.append(nums[i])
            dfs(i, substring, curSum + nums[i])
            substring.pop()
            dfs(i + 1, substring, curSum)

        dfs(0, [], 0)

        return output
        