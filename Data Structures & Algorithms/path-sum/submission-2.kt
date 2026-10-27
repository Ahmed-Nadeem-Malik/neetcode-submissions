/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        fun dfs(node: TreeNode?, cur: Int): Boolean {
            if (node == null) return false

            val update = cur + node.`val`
            if (node.left == null && node.right == null) return update == targetSum
            return dfs(node?.left, update) || dfs(node?.right, update)
        }
        return dfs(root, 0)
    }
}
