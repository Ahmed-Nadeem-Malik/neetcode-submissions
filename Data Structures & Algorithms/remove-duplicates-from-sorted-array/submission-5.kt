class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var swap = 1
        for (i in 1 until nums.size) if (nums[i] != nums[i - 1]) nums[swap++] = nums[i]
        return swap
    }
}
