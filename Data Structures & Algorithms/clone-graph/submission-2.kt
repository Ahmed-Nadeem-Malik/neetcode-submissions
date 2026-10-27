/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        val oldToNew = mutableMapOf<Node, Node>()

        fun dfs(old: Node): Node {
            if (old in oldToNew) return oldToNew[old]!!

            val new = Node(old.`val`)
            oldToNew[old] = new

            for (n in old.neighbors){
                n?.let { new.neighbors.add(dfs(it)) }
            }

            return new
        }
        return dfs(node)
    }
}
