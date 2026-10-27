class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        perms = [[]]

        for num in nums:
            newPerms = []
            for perm in perms:
                for i in range(len(perm) + 1):
                    pCopy = perm.copy()
                    pCopy.insert(i, num)
                    newPerms.append(pCopy)
            perms = newPerms
        return perms