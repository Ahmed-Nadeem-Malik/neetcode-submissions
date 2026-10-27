class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var maxArea = 0

        fun islandArea(r: Int, c: Int, area: Int = 0): Int {
            if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) return 0
            grid[r][c] = 0
            return 1 + islandArea(r + 1, c) + islandArea(r, c + 1) + islandArea(r - 1, c) + islandArea(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] != 1) continue
                maxArea = max(maxArea, islandArea(r, c))
            }
        }
        return maxArea
    }
}
