data class Node(val key: Int, var value: Int, var prev: Node? = null, var next: Node? = null)

class LRUCache(capacity: Int) {
    val capacity = capacity 
    val cache = mutableMapOf<Int, Node>()
    var left = Node(-1, -1)
    var right = Node(-1, -1)

    init {
        left.next = right
        right.prev = left
    }

    fun get(key: Int): Int {
        return cache[key]?.let { node -> 
            remove(node)
            insert(node)
            node.value
        } ?: -1
    }

    fun put(key: Int, value: Int) {
        cache[key]?.let { node -> 
            remove(node)
            cache.remove(key)
        }

        val node = Node(key, value)
        cache[key] = node
        insert(node)

        if (cache.size > capacity) {
            left.next?.let { lru ->
                remove(lru)
                cache.remove(lru.key)
            }
        }
    }

    private fun remove(node: Node) {
        val prev = node.prev 
        val next = node.next
        prev?.next = next
        next?.prev = prev
    }

    private fun insert(node: Node) {
        val prev = right.prev
        val next = right
        prev?.next = node
        next?.prev = node
        node.next = next
        node.prev = prev
    }
}