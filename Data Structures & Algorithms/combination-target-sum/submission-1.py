class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        output = []
        curSub = []
        
        def dfs(i, curSum):
            if curSum == target:
                output.append(curSub.copy())
                return
            if i >= len(nums) or curSum > target:
                return

            dfs(i + 1, curSum)
            curSub.append(nums[i])
            dfs(i, curSum + nums[i])
            curSub.pop() 

        dfs(0, 0)
        return output