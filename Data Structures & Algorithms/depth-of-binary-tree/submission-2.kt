/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val q = ArrayDeque<TreeNode>()
        q.addLast(root)
        var level = 0

        while (q.isNotEmpty()) {
            val size = q.size
            repeat(size) {
                val node = q.removeFirst()
                if (node?.left != null) q.addLast(node?.left)
                if (node?.right != null) q.addLast(node?.right)
            }
            level++
        }
        return level
    }
}
