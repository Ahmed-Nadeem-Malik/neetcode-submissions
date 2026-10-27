class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        output = []
        curSub = []

        def dfs(i):
            if i >= len(nums):
                output.append(curSub.copy())
                return

            curSub.append(nums[i])
            dfs(i+1)
            curSub.pop()
            dfs(i+1)

        dfs(0)
        return output 