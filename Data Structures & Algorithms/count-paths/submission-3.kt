class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val cache = Array(m) { IntArray(n) { -1 }}
        fun dfs(i: Int, j: Int): Int {
            if (i == m - 1 && j == n - 1) return 1
            if (i >= m || j >= n) return 0
            if (cache[i][j] != -1) return cache[i][j]
            cache[i][j] =  dfs(i, j + 1) + dfs(i + 1, j)
            return cache[i][j]
        }

        return dfs(0,0)
    }
}
