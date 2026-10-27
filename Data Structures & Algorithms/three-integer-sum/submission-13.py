class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        output = []
        nums.sort()

        for i, num in enumerate(nums):
            if num > 0:
                break

            if i > 0 and num == nums[i - 1]:
                continue

            l = i + 1
            r = len(nums) - 1

            while l < r:
                sumN = num + nums[l] + nums[r]
                if sumN < 0:
                    l += 1
                elif sumN > 0:
                    r -= 1
                else:
                    output.append([num, nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while nums[l] == nums[l - 1] and l < r:
                        l += 1
                    

            
        
        return output







#
#   0 1 2 3
#
#
#


        