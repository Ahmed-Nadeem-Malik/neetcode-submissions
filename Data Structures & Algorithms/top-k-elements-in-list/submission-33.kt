class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numToCount = mutableMapOf<Int, Int>()
        for (num in nums) {
            numToCount[num] = 1 + numToCount.getOrDefault(num, 0)
        }

        val buckets = List(nums.size + 1) { mutableListOf<Int>() }
        for ((num, count) in numToCount) {
            buckets[count].add(num)
        }

        val output = mutableListOf<Int>()
        for (i in buckets.size - 1 downTo 1) {
            for (num in buckets[i]) {
                output.add(num)
                if (output.size == k) return output.toIntArray()
            }
        }
        return output.toIntArray()
    }
}
