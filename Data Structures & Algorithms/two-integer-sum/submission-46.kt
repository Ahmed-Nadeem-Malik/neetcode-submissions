class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val first = target - num
            if (first in seen) return intArrayOf(seen[first]!!, i)
            seen[num] = i
        }
        return intArrayOf()
    }
}
