class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        output = []

        def backtrack(i, curSum, curCom):
            if curSum == target:
                output.append(curCom.copy())
                return

            if i >= len(nums):
                return

            if curSum > target:
                return

            curSum += nums[i]
            curCom.append(nums[i])
            backtrack(i, curSum, curCom)
            curSum -= nums[i]
            curCom.pop()

            backtrack(i + 1, curSum, curCom)

        backtrack(0, 0, [])

        return output