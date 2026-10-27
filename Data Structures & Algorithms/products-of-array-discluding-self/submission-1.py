class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        outArr = []
        for idx, num in enumerate(nums):
            prod = 1
            for i, otherNum in enumerate(nums):
                if idx == i:
                    continue
                prod *= otherNum
            outArr.append(prod)
        return outArr
                
                

