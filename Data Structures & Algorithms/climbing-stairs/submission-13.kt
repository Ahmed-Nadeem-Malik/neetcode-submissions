class Solution {
    fun climbStairs(n: Int): Int {
        val cache = mutableMapOf<Int, Int>()

        fun dfs(i: Int): Int {
            if (i >= n) return if (i == n) 1 else 0
            if (i in cache) return cache[i]!!
            cache[i] = dfs(i + 1) + dfs(i + 2)
            return cache[i]!!
        }

        return dfs(0)
    }
}