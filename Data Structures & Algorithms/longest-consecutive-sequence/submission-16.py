class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        output = 0
        numset = set(nums)

        for num in nums:
            if (num - 1) not in numset:
                cur = 1
                while (num + cur) in numset:
                    cur += 1
                output = max(output, cur)
        return output


        

        



        