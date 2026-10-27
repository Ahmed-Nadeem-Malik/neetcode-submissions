class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val pq = PriorityQueue<Int> { a, b ->
            b.compareTo(a)
        }

        stones.forEach { pq.add(it) }

        while (pq.size > 1) {
            val x = pq.poll()
            val y = pq.poll()

            if (x != y) {
                pq.add(x - y)
            }
        }

        return if (pq.isEmpty()) 0 else pq.poll()
    }
}