class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableListOf<List<Int>>()
        val sub = mutableListOf<Int>()

        fun dfs(i: Int) {
            if (i >= nums.size) {
                res.add(sub.toList())
                return
            }

            sub.add(nums[i])
            dfs(i + 1)
            sub.removeLast()

            var idx = i
            while (idx < nums.size && nums[i] == nums[idx]) idx++

            dfs(idx)
        }

        dfs(0)
        return res
    }
}
