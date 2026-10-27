class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val dirs = arrayOf((1 to 0), (0 to 1), (-1 to 0), (0 to -1))
        val q = ArrayDeque<Pair<Int, Int>>()
        var fresh = 0
        var time = 0

        for (r in 0 until rows) {
            for (c in 0 until cols) {
               if (grid[r][c] == 2) q.addLast(r to c)
               if (grid[r][c] == 1) fresh++
            }
        }

        while (fresh > 0 && q.isNotEmpty()) {
            val length = q.size 
            repeat(length) {
                val (r, c) = q.removeFirst()
                for ((dr, dc) in dirs) {
                    val nr = r + dr
                    val nc = c + dc
                    if (nr !in 0 until rows || nc !in 0 until cols || grid[nr][nc] != 1) continue 
                    grid[nr][nc] = 2
                    q.addLast(nr to nc)
                    fresh--
                }
            }
            time++
        }

        return if (fresh == 0) time else -1
    }
}
