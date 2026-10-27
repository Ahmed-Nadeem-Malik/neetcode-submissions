class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        output = []
        subsets = []

        def dfs(i):
            if len(subsets) == k:
                output.append(subsets.copy())
                return

            if i > n:
                return

            for j in range(i, n+1):
                subsets.append(j)
                dfs(j+1)
                subsets.pop()


        dfs(1)
        return output
