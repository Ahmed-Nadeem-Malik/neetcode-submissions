class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            if (num in seen) if (abs(seen[num]!! - i) <= k) return true
            seen[num] = i

        }

        return false

    }
}
