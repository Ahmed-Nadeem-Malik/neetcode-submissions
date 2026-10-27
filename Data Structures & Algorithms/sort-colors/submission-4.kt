class Solution {
    fun sortColors(nums: IntArray) {
        val count = IntArray(3)
        for (num in nums) {
            count[num]++
        }

        var index = 0
        for (i in 0 until 3) {
            while (count[i]-- > 0) {
                nums[index++] = i
            }
        }

    }
}
