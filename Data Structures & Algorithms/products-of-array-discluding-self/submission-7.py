class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        product, zeroCount = 1, 0

        for num in nums:
            if num == 0:
                zeroCount += 1
                continue
            product *= num
        
        if zeroCount >= 2:
            return [0] * len(nums)
        
        output = []

        if zeroCount == 1:
            for num in nums:
                if num == 0:
                    output.append(product)
                else:
                    output.append(0)
        else:
            for num in nums:
                output.append(int(product / num))

        return output