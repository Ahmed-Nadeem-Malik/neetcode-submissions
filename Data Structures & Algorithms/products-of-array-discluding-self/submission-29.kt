class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var zeroCount = 0
        var product = 1
        for (num in nums) {
            if (num == 0) zeroCount++ else product *= num
        }
        val res = IntArray(nums.size)
        if (zeroCount > 1) return res

        for (i in nums.indices) {
            res[i] = if (zeroCount > 0) {
                if (nums[i] == 0) product else 0
            } else {
                product / nums[i]
            }
        } 

        return res
    }
}
