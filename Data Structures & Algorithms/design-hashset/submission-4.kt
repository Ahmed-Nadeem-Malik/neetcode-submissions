class MyHashSet() {
    val map = IntArray(1000001) {-1}

    fun add(key: Int) {
        map[key] = key
    }

    fun remove(key: Int) {
        if (map[key] == -1) return
        map[key] = -1
    }

    fun contains(key: Int): Boolean {
        if (map[key] != -1) return true
        return false
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
