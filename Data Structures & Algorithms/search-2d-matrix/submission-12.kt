class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var rows = matrix.size
        var cols = matrix[0].size
        var top = 0
        var bottom = rows - 1

        while (top <= bottom) {
            val row = top + (bottom - top) / 2
            if (target > matrix[row][cols -1]) {
                top = row + 1
            } else if (target < matrix[row][0]) {
                bottom = row - 1
            } else {
                break
            }
        }

        if (!(top <= bottom)) return false
        var row = (top + bottom) / 2
        var l = 0
        var r = cols - 1
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
