class Solution {
    fun maxArea(heights: IntArray): Int {
        var l = 0
        var r = heights.size - 1
        var max = 0
        while (l < r) {
            val lbar = heights[l]
            val rbar = heights[r]
            max = maxOf((r - l) * min(lbar, rbar), max)
            if (lbar < rbar) l++ else r--
        }
        return max
    }
}
