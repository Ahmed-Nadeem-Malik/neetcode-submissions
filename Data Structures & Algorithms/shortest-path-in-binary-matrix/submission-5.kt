class Solution {
    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        if (grid[0][0] == 1 || grid[rows - 1][cols - 1] == 1) {
            return -1
        }

        val directions = arrayOf(
            0 to 1,
            1 to 0,
            0 to -1,
            -1 to 0,
            1 to 1,
            -1 to -1,
            1 to -1,
            -1 to 1
        )

        val q = ArrayDeque<Triple<Int, Int, Int>>()
        val visited = Array(rows) { BooleanArray(cols) }

        visited[0][0] = true
        q.add(Triple(0, 0, 1))

        while (q.isNotEmpty()) {
            val (r, c, length) = q.removeFirst()

            if (r == rows - 1 && c == cols - 1) {
                return length
            }

            for ((dr, dc) in directions) {
                val nr = r + dr
                val nc = c + dc

                if (
                    nr in 0 until rows &&
                    nc in 0 until cols &&
                    grid[nr][nc] == 0 &&
                    !visited[nr][nc]
                ) {
                    visited[nr][nc] = true
                    q.add(Triple(nr, nc, length + 1))
                }
            }
        }

        return -1
    }
}