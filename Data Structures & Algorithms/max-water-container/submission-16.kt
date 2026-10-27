class Solution {
    fun maxArea(heights: IntArray): Int {
        var l = 0
        var r = heights.size - 1
        var max = 0
        while (l < r) {
            max = maxOf((r - l) * min(heights[l], heights[r]), max)
            if (heights[l] < heights[r]) l++ else r--
        }
        return max
    }
}
