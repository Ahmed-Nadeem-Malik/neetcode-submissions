class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val output = IntArray(n * 2)
        for (i in nums.indices) {
            output[i] = nums[i]
            output[i + n] = nums[i]
        }

        return output

    }
}
