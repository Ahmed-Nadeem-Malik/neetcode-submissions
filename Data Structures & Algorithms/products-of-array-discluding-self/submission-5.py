class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        product, zeroCount = 1, 0

        for i in range(len(nums)):
            if nums[i] ==  0:
                zeroCount += 1
            else:
                product *= nums[i]
                
        output = []

        if zeroCount >= 2:
            return [0] * len(nums)
        elif zeroCount == 1:
            for num in nums:
                if num != 0:
                    output.append(0)
                else:
                    output.append(int(product))
            return output
        else:
            for num in nums:
                output.append(int(product//num))
            return output

        