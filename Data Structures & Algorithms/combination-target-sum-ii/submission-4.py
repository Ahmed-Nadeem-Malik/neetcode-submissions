from typing import List

class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        output = []
        candidates.sort()
        n = len(candidates)

        def dfs(i, sub, curSum):
            if curSum == target:
                output.append(sub.copy())
                return
            if i >= n or curSum > target:
                return

            # include
            sub.append(candidates[i])
            dfs(i + 1, sub, curSum + candidates[i])
            sub.pop()  # undo pick

            # exclude and skip duplicates of candidates[i]
            j = i + 1
            while j < n and candidates[j] == candidates[i]:
                j += 1
            dfs(j, sub, curSum)

        dfs(0, [], 0)
        return output