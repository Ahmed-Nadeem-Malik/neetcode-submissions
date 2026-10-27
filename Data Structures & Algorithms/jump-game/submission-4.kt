class Solution {
    fun canJump(nums: IntArray): Boolean {
        var goal = nums.size - 1

        for (i in nums.size - 1 downTo 0) {
            if (i + nums[i] >= goal) goal = i 
        }

        if (goal == 0) return true else return false
    }
}
