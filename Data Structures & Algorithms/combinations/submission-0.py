class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        output = []
        curSet = []

        def helper(i, curSet):
            if len(curSet) == k:
                output.append(curSet.copy())
                return

            if i > n:
                return

            curSet.append(i)
            helper(i+1, curSet)
            curSet.pop()

            helper(i+1, curSet)

        helper(1, curSet)
        return output