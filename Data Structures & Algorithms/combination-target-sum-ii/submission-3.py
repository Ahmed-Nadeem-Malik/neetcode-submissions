class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        output = []

        def backtrack(i, curSum, curComb):
            if curSum == target:
                output.append(curComb.copy())
                return
            if i >= len(candidates) or curSum > target:
                return

            curSum += candidates[i]
            curComb.append(candidates[i])
            backtrack(i + 1, curSum, curComb)
            curSum -= candidates[i]
            curComb.pop()

            while i + 1 < len(candidates) and candidates[i] == candidates[i+1]:
                i += 1
            backtrack(i + 1, curSum, curComb)

        backtrack(0, 0, [])
        return output