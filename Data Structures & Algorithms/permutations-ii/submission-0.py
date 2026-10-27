class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        perm = []
        output = []
        count = {}

        for n in nums:
            if n in count:
                count[n] += 1
            else:
                count[n] = 1

        def dfs():
            if len(perm) == len(nums):
                output.append(perm.copy())
                return

            for n in count:
                if count[n] > 0:
                    perm.append(n)
                    count[n] -= 1
                    dfs()
                    perm.pop()
                    count[n] += 1

        dfs()

        return output