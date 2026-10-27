class Solution {
    fun isBalanced(root: TreeNode?): Boolean {

        fun dfs(node: TreeNode?): Pair<Boolean, Int> {
            if (node == null) return true to 0

            val left = dfs(node?.left)
            val right = dfs(node?.right)

            val balanced =
                left.first &&
                right.first &&
                Math.abs(left.second - right.second) <= 1

            val height = 1 + maxOf(left.second, right.second)

            return balanced to height
        }

        return dfs(root).first
    }
}