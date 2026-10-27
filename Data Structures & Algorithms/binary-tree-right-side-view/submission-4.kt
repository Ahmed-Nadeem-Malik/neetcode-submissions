class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val res = mutableListOf<Int>()
        val q = ArrayDeque<TreeNode>()
        q.add(root)

        while (q.isNotEmpty()) {
            val n = q.size

            for (i in 0 until n) {
                val node = q.removeFirst()
                node.left?.let { q.add(it) }
                node.right?.let { q.add(it) }
                if (i == n - 1) res.add(node.`val`)
            }
        }

        return res
    }
}