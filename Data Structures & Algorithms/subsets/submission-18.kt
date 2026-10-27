class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val output = mutableListOf<List<Int>>()
        val cur = mutableListOf<Int>()

        fun recurse(i: Int) {
            if (i >= nums.size) {
                output.add(cur.toList())
                return
            }

            cur.add(nums[i])
            recurse(i + 1)
            cur.removeLast()
            recurse(i + 1)
        }
        recurse(0)
        return output
    }
}
