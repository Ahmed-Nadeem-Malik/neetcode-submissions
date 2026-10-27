class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashSet = set(nums)
        output = 0
        for num in nums:
            curStreak = 0
            if num - 1 not in hashSet:
                while (num + curStreak) in hashSet:
                    curStreak += 1
            output = max(output, curStreak)

        return output 

        