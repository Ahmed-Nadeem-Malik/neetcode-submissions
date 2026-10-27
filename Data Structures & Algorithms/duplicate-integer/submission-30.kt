class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (num in nums) {
            if (num in seen) return true else seen.add(num)
        }
        return false
    }
}
