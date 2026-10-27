class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val rows = obstacleGrid.size
        val cols = obstacleGrid[0].size

        val cache = mutableMapOf<Pair<Int, Int>, Int>()

        fun dfs(r: Int, c: Int): Int {
            if (r !in 0 until rows || c !in 0 until cols || obstacleGrid[r][c] == 1) return 0
            if (r == rows - 1 && c == cols - 1) return 1
            val key = r to c
            if (key in cache) return cache[key]!!
            cache[key] = dfs(r + 1, c) + dfs(r, c + 1)
            return cache[key]!!
        }

        return dfs(0, 0)
    }
}
