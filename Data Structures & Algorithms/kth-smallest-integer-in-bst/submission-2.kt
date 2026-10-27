class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val stack = mutableListOf<TreeNode>()
        var current = root
        var i = 0

        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.add(current)
                current = current.left
            }

            val node = stack.removeLast()
            i++
            if (i == k) return node.`val`

            current = node.right
        }
        return -1
    }
}