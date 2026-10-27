class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        arr = []

        for idx, num in enumerate(nums):
            if num in arr:
                return True
            arr.append(num)
        return False