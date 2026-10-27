class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k = k % n  # handle k > n
        shiftArr = [0] * n

        for i in range(n):
            shiftArr[(i + k) % n] = nums[i]

        # copy back into nums
        for i in range(n):
            nums[i] = shiftArr[i]