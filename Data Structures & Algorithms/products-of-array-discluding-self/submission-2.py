class Solution:

    def productExceptSelf(self, nums: List[int]) -> List[int]:

        prefix = []
        postfix = []
        preProd = 1
        postProd = 1

        for i in range(len(nums)):
            preProd *= nums[i]
            prefix.append(preProd)

            postProd *= nums[len(nums) - i - 1]
            postfix.append(postProd)
        postfix.reverse()
        
        output = []
        for idx in range(len(nums)):
            if idx == 0:
                output.append(postfix[1])
            elif idx == len(nums) - 1:
                output.append(prefix[-2])
            else:
                output.append(prefix[idx-1]*postfix[idx+1])
        return output
            



