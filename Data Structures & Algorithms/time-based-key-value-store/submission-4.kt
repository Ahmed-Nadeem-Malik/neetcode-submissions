class TimeMap() {
    val storage = mutableMapOf<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if (!storage.containsKey(key)) storage[key] = mutableListOf()
        storage[key]!!.add(Pair(value, timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        var res = ""
        val values = storage[key] ?: return res
        var l = 0
        var r = values.size - 1

        while (l <= r) {
            val m = l + (r - l) / 2
            if (values[m].second <= timestamp) {
                res = values[m].first
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return res
    }
}
