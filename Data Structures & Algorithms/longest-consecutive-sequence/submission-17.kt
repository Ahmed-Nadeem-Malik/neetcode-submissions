class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val nset = nums.toSet()
        var longest = 0

        for (num in nset) {
            if ((num - 1) !in nset) {
                var length = 1
                while ((num + length) in nset) { length++ }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}
