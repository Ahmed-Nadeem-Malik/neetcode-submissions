class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for (num in nums) {
            if (num != `val`) {
                nums[k] = num
                k++
            }
        }

        return k
    }
}