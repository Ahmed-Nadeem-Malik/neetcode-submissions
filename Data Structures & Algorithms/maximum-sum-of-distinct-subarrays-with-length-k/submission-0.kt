
class Solution {
    fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        var output = 0L
        var sum = 0L
        val seen = mutableSetOf<Int>()
        var l = 0

        for (r in nums.indices) {

            // Remove elements until nums[r] is unique
            while (nums[r] in seen) {
                seen.remove(nums[l])
                sum -= nums[l].toLong()
                l++
            }

            // Add the new element
            seen.add(nums[r])
            sum += nums[r].toLong()

            // Keep window size at most k
            if (r - l + 1 > k) {
                seen.remove(nums[l])
                sum -= nums[l].toLong()
                l++
            }

            if (r - l + 1 == k) output = maxOf(output, sum)
        }

        return output
    }
}
