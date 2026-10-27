class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val bullseye = target - num
            if (bullseye in seen) return intArrayOf(seen[bullseye]!!, i)
            seen[num] = i
        }

        return intArrayOf()
    }
}
