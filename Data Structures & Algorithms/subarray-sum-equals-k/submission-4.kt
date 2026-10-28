class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var res = 0
        var curSum = 0
        var prefix = mutableMapOf<Int, Int>(0 to 1)
        for (num in nums) {
            curSum += num
            val diff = curSum - k
            res += prefix.getOrDefault(diff, 0)
            prefix[curSum] = 1 + prefix.getOrDefault(curSum, 0)
        }
        return res
    }
}
