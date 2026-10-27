class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val output = mutableListOf<List<Int>>()
        fun backtrack(perm: MutableList<Int>, pick: BooleanArray) {
            if (perm.size == nums.size) {
                output.add(perm.toList())
                return
            }

            for (i in nums.indices) {
                if (!pick[i]) {
                    perm.add(nums[i])
                    pick[i] = true
                    backtrack(perm, pick)
                    pick[i] = false
                    perm.removeLast()
                }
            }

        }
        backtrack(mutableListOf(), BooleanArray(nums.size))

        return output

    }
}
