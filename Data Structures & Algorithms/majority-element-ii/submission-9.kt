class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val count = mutableMapOf<Int, Int>()
        val output = mutableListOf<Int>()
        for (num in nums) {
            count[num] = 1 + count.getOrDefault(num, 0)
        }
        for ((num, cnt) in count) {
            if (cnt > nums.size / 3) output.add(num)
        }
        return output

    }
}
