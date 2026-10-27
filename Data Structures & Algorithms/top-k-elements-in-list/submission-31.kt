class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numToCount = mutableMapOf<Int, Int>()
        for (num in nums) {
            numToCount[num] = numToCount.getOrDefault(num, 0) + 1
        }
        val countToNum = List(nums.size + 1) { mutableListOf<Int>() }
        for ((num, count) in numToCount) {
            countToNum[count].add(num)
        }
        val output = mutableListOf<Int>()
        for (i in countToNum.size - 1 downTo 1) {
            for (num in countToNum[i]) {
                output.add(num)
                if (output.size == k) {
                    return output.toIntArray()
                }
            }
        }
        return output.toIntArray()
    }
}