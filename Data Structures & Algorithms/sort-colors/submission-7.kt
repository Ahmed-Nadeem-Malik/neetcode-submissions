class Solution {
    fun sortColors(nums: IntArray) {
        var zeros = 0
        var ones = 0

        for (num in nums) {
            if (num == 0) zeros++
            if (num == 1) ones++
        }

        for (i in nums.indices) {
            nums[i] = when {
                i < zeros -> 0
                i < zeros + ones -> 1
                else -> 2
            }
        }
    }
}