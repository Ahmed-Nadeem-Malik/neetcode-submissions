class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size
        var l = 0
        var r = rows - 1
        var row = -1

        while (l <= r) {
            val m = l + (r - l) / 2
            if (matrix[m].first() > target) {
                r = m - 1
            } else if (matrix[m].last() < target) {
                l = m + 1 
            } else {
                row = m
                break
            }
        }

        if (row == -1) return false
        l = 0
        r = cols - 1

        while (l <= r) {
            val m = l + (r - l) / 2
            if (target > matrix[row][m]) {
                l = m + 1
            } else if (target < matrix[row][m]) {
                r = m - 1
            } else {
                return true
            }
        }
        return false
    }
}