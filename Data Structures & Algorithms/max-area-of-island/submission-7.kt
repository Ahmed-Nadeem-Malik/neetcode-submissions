class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val visit = mutableSetOf<Pair<Int, Int>>()
        var area = 0

        fun dfs(r: Int, c: Int): Int {
            if (r !in 0 until rows 
            || c !in 0 until cols 
            || grid[r][c] == 0 
            || visit.contains(r to c) ) return 0

            visit.add(r to c)
            return 1 + dfs(r + 1, c) + dfs(r - 1, c) + dfs(r, c + 1) + dfs(r, c - 1)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                area = maxOf(area, dfs(r, c))
            }
        }

        return area
    }
}
