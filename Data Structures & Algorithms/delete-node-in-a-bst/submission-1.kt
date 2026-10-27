class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if (root == null) return null

        if (key > root.`val`) {
            root.right = deleteNode(root.right, key)
        } else if (key < root.`val`) {
            root.left = deleteNode(root.left, key)
        } else {
            // No left child
            if (root.left == null) {
                return root.right
            }

            // No right child
            if (root.right == null) {
                return root.left
            }

            // Two children:
            // Find smallest node in right subtree
            var cur = root.right!!

            while (cur.left != null) {
                cur = cur.left!!
            }

            // Copy successor value
            root.`val` = cur.`val`

            // Delete successor from right subtree
            root.right = deleteNode(root.right, cur.`val`)
        }

        return root
    }
}