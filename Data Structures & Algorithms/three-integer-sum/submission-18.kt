class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val output = mutableListOf<List<Int>>()
        nums.sort()

        for (i in nums.indices) {
            var l = i + 1
            var r = nums.size - 1 
            var first = nums[i]
            if (i > 0 && first == nums[i - 1]) continue
            while (l < r) {
                val second = nums[l]
                val third = nums[r]
                val sum = first + second + third
                if (sum > 0) {
                    r--
                } else if (sum < 0) {
                    l++
                } else {
                    output.add(listOf(first, second, third))
                    l++
                    r--
                    while (l < r && nums[l] == nums[l - 1]) {l++}
                }
            }
        }

        return output
    }
}
