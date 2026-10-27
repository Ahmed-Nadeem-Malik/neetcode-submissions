/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()

        fun dfs(node: TreeNode?) {
            if (node == null) return
            if (node.left != null) dfs(node.left)
            res.add(node.`val`)
            if (node.right != null) dfs(node.right)
        }

        dfs(root)
        return res
    }
}
