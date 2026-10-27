class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size) {1}

        var prefix = 1
        for (i in nums.indices) {
            output[i] = prefix
            prefix *= nums[i]
        }
        var sufix = 1 
        for (i in nums.size - 1 downTo 0) {
            output[i] *= sufix
            sufix *= nums[i]
        }

        return output
    }
}
