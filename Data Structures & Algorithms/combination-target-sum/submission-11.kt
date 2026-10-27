class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()

        val res = mutableListOf<List<Int>>()
        val subset = mutableListOf<Int>()

        fun dfs(i: Int, curSum: Int) {
            if (curSum == target) {
                res.add(subset.toList())
                return
            }

            if (i >= nums.size || curSum > target) return

            // take nums[i]
            subset.add(nums[i])
            dfs(i, curSum + nums[i])
            subset.removeAt(subset.lastIndex)

            // skip nums[i] and any duplicates of it
            var next = i + 1
            while (next < nums.size && nums[next] == nums[i]) {
                next++
            }

            dfs(next, curSum)
        }

        dfs(0, 0)
        return res
    }
}
