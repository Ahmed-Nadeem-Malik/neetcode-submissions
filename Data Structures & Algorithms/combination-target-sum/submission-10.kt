class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val subset = mutableListOf<Int>()

        fun dfs(i: Int, curSum: Int) {
            if (curSum == target) {
                res.add(subset.toList())
                return
            }

            if (i >= nums.size || curSum > target) {
                return
            }

            // Include nums[i]
            subset.add(nums[i])
            dfs(i, curSum + nums[i])

            // Backtrack
            subset.removeAt(subset.lastIndex)

            // Don't include nums[i]
            var curI = i
            while (curI < nums.size && nums[i] == nums[curI]) {
                curI++
            }

            dfs(curI, curSum)
        }

        dfs(0, 0)
        return res
    }
}

