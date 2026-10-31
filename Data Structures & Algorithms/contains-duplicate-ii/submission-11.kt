class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var l = 0

        for (r in nums.indices) {
            if (r - l > k) seen.remove(nums[l++])
            if (nums[r] in seen) return true
            seen.add(nums[r])
        }

        return false
    }
}
