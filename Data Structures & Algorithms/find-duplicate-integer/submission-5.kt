class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var slow2 = 0
        var fast = 0

        while (true) {
            slow = nums[slow]
            fast = nums[nums[fast]]
            if (slow == fast) break
        }

        while(true) {
            slow2 = nums[slow2]
            fast = nums[fast]
            if (slow2 == fast) return slow2
        }

        return -1
    }
}
