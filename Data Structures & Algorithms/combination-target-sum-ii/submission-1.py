class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        output = []
        subset = []
        candidates.sort()

        def dfs(i, count):
            if count == target:
                output.append(subset.copy())
                return

            if count > target or i >= len(candidates):
                return

            count += candidates[i]
            subset.append(candidates[i])
            dfs(i+1, count)
            subset.pop()
            count -= candidates[i]

            while i+1 < len(candidates) and candidates[i] == candidates[i+1]:
                i += 1
            
            dfs(i+1, count)


        dfs(0, 0)
        return output