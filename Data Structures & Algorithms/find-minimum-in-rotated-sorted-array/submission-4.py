class Solution:
    def findMin(self, nums: List[int]) -> int:
        output = nums[0]

        l = 0
        r = len(nums) - 1

        while l <= r:
            if nums[l] < nums[r]:
                output = min(output, nums[l])
                break

            m = (l + r) // 2
            output = min(output, nums[m])
            if nums[l] <= nums[m]:
                l = m + 1
            else:
                r = m - 1

        return output 



"""


[4,5,0,1,2,3]
in left or right portion

either we are in a sorted potion with no wrong elements
if we are in the sorted potion we are good doing a normal binary seartch
else see if left most value is less than right most if so then we search left else right


"""