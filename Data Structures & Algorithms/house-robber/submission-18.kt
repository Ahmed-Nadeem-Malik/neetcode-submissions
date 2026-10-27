class Solution {
    fun rob(nums: IntArray): Int {
        val cache = mutableMapOf<Int, Int>()
        fun dp(i: Int): Int {
            if (i >= nums.size) return 0
            if (i in cache) return cache[i]!!
            cache[i] =  max(dp(i + 1), nums[i] + dp(i + 2))
            return cache[i]!!
        }
        return dp(0)
    }
}
