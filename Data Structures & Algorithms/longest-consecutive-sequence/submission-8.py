class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        output = 0
        numSet = set(nums)

        for num in numSet:
            count = 0
            if (num - 1) in numSet:
                continue
            
            while (num + count) in numSet:
                count += 1
            
            output = max(output, count)

        return output
  