/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val output = mutableListOf<List<Int>>()
        if (root == null) return listOf()

        val q = ArrayDeque<TreeNode>() 
        q.addLast(root)

        while (q.isNotEmpty()) {
            val level = mutableListOf<Int>()
            val qLen = q.size

            repeat(qLen) {
                val pop = q.removeFirst()
                level.add(pop.`val`)
                pop.left?.let { q.add(it) }
                pop.right?.let { q.add(it) }
            }
            output.add(level)
        }
        return output
    }
}
