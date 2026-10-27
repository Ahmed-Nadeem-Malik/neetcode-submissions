class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        output = []

        for idx, num in enumerate(nums):
            if idx > 0 and num == nums[idx -1]:
                continue
            l = idx+1
            r = len(nums) - 1
            while l < r:
                sumVal = num + nums[l] + nums[r]
                if sumVal == 0:
                    output.append([num, nums[l], nums[r]])
                    leftVal = nums[l]
                    r -= 1
                    l += 1
                    while nums[l] == leftVal and l < r:
                        l += 1
                    
                elif sumVal > 0:
                    r -= 1
                else:
                    l += 1

        return output


        