class Solution {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0

        val n = height.size
        val maxLeft = MutableList(n) { 0 }
        val maxRight = MutableList(n) { 0 }

        var maxL = 0
        for (i in 0 until n) {
            maxLeft[i] = maxL
            maxL = maxOf(height[i], maxL)
        }

        var maxR = 0
        for (i in n - 1 downTo 0) {
            maxRight[i] = maxR
            maxR = maxOf(height[i], maxR)
        }

        var res = 0
        for (i in 0 until n) {
            val water = minOf(maxLeft[i], maxRight[i]) - height[i]
            if (water > 0) res += water
        }
        return res
    }
}
