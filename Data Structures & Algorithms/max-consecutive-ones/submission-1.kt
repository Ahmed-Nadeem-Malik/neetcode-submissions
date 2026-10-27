class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var res = 0
        var cur = 0
        var streak = false

        for (num in nums) {
            if (num == 1) {
                if (!streak) streak = true
                cur++
                res = maxOf(res, cur)
                continue
            }
            streak = false
            cur = 0
        }
        return res
    }
}
