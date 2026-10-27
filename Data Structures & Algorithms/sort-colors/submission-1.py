from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """ 
        hashMap = {}

        for num in nums:
            hashMap[num] = 1 + hashMap.get(num, 0)

        index = 0
        for i in range(3):
            count = hashMap.get(i, 0)
            while count > 0:
                nums[index] = i
                index += 1
                count -= 1