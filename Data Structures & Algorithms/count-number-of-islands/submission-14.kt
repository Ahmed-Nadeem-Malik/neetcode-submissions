class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var islands = 0

        fun dfs(r: Int, c: Int) {
            if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') return
            grid[r][c] = '0'
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == '0') continue
                islands++
                dfs(r,c)
            }
        }

        return islands
    }
}
