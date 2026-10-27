class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        val count = HashMap<Int, Int>()

        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        for ((key, value) in count) {
            freq[value].add(key)
        }

        val output = mutableListOf<Int>()
        var j = nums.size
        while (output.size < k && j >= 0) {
            for (num in freq[j]) {
                if (output.size == k) break
                output.add(num)
            }
            j--
        }
        return output.toIntArray()
    }
}