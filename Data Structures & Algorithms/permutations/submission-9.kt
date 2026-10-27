class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        fun backtrack(perm: MutableList<Int>, pick: BooleanArray) {
            if (perm.size == nums.size) {
                res.add(ArrayList(perm))
                return
            }
            for (i in nums.indices) {
                if (!pick[i]) {
                    perm.add(nums[i])
                    pick[i] = true
                    backtrack(perm, pick)
                    perm.removeAt(perm.size - 1)
                    pick[i] = false
                }
            }
        }

        backtrack(mutableListOf(), BooleanArray(nums.size))
        return res
    }
}