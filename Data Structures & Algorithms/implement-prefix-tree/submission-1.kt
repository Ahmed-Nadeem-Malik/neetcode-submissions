data class Node(
    val children: MutableMap<Char, Node> = mutableMapOf(),
    var end: Boolean = false
)

class PrefixTree {
    val root = Node()

    fun insert(word: String) {
        var cur = root
        for (c in word) {
            cur.children.putIfAbsent(c, Node())
            cur = cur.children[c]!!
        }
        cur.end = true

    }

    fun search(word: String): Boolean {
        var cur = root
        for (c in word) {
            if (c !in cur.children) return false
            cur = cur.children[c]!!
        }

        return cur.end
    }

    fun startsWith(prefix: String): Boolean {
        var cur = root
        for (c in prefix) {
            if (c !in cur.children) return false
            cur = cur.children[c]!!
        }
        return true
    }
}
