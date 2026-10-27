class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        val cache = IntArray(n + 1) { -1 }
        fun dfs(i: Int): Int {
            if (i >= n) return 0
            if (cache[i] != -1) return cache[i]
            cache[i] =  maxOf(dfs(i + 1), nums[i] + dfs(i + 2))
            return cache[i]
        }
        
        return dfs(0)
    }
}
