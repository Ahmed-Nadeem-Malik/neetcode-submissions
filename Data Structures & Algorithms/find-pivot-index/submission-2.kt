class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var total = nums.sum()
        var leftSum = 0
        for (i in nums.indices) {
            var rightSum = total - leftSum - nums[i]
            if (leftSum == rightSum) return i
            leftSum += nums[i]
        }
        return -1
    }
}
