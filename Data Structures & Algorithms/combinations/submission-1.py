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

            subsets.append(i)
            dfs(i+1)
            subsets.pop()

            dfs(i+1)

        dfs(1)
        return output
