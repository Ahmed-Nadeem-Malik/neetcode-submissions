class Solution {
    fun sortArray(nums: IntArray): IntArray {
        fun countingSort() {
            val count = mutableMapOf<Int, Int>()
            var min = Int.MAX_VALUE
            var max = Int.MIN_VALUE

            for (num in nums) {
                count[num] = 1 + count.getOrDefault(num, 0)
                min = min(min, num)
                max = max(max, num)
            }
            var i = 0
            for (v in min..max) {
                var c = count.getOrDefault(v, 0)
                for (j in 0 until c) {
                    nums[i++] = v
                }
            }
        }
        countingSort()
        return nums
    }
}
