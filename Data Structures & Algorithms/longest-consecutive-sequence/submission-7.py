class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        output = 0

        for num in numSet:
            count = 0
            if (num - 1) in numSet:
                continue
            else:
                count += 1
                while (num + count) in numSet:
                    count += 1
                output = max(count, output)
        return output 
