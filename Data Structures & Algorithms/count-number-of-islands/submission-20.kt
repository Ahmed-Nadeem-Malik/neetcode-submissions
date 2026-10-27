class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var islands = 0

        fun deleteIsland(r: Int, c: Int) {
            if (r >= rows || r < 0 || c >= cols || c < 0 || grid[r][c] == '0') return
            grid[r][c] = '0'
            deleteIsland(r + 1, c)
            deleteIsland(r, c + 1)
            deleteIsland(r - 1, c)
            deleteIsland(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] != '1') continue
                deleteIsland(r, c)
                islands++
            }
        }

        return islands
    }
}
