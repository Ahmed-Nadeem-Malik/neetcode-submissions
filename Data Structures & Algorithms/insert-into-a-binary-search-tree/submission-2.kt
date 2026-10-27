/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun insertIntoBST(root: TreeNode?, value: Int): TreeNode? {
        if (root == null) return TreeNode(value)

        if (value > root.`val`) {
            root.right = insertIntoBST(root.right, value)
        } else {
            root.left = insertIntoBST(root.left, value)
        }
        return root
    }
}
