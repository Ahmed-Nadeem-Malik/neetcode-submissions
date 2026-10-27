class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val arr = IntArray(n*2)

        for (i in nums.indices) {
            arr[i] = nums[i]
            arr[n + i] = nums[i]
        }
        return arr
    }
}
