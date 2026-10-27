data class Node(
    val children: MutableMap<Char, Node> = mutableMapOf(),
    var isEnd: Boolean = false
)

class WordDictionary {

    private val root = Node()

    fun addWord(word: String) {
        var cur = root

        for (c in word) {
            cur.children.putIfAbsent(c, Node())
            cur = cur.children[c]!!
        }

        cur.isEnd = true
    }

    fun search(word: String): Boolean {
        return dfs(word, root, 0)
    }

    private fun dfs(word: String, node: Node, start: Int): Boolean {
        var cur = node

        for (i in start until word.length) {
            val c = word[i]

            if (c == '.') {
                for (child in cur.children.values) {
                    if (dfs(word, child, i + 1)) return true
                }

                return false
            }

            cur = cur.children[c] ?: return false
        }

        return cur.isEnd
    }
}
