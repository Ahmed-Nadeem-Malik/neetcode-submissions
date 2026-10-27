class KthLargest(val k: Int, nums: IntArray) {
    val minHeap = PriorityQueue<Int>()

    init {
        for (num in nums) {
            minHeap.offer(num)
            if (minHeap.size > k) {
                minHeap.poll()
            }
        }
    }

    fun add(`val`: Int): Int {
        minHeap.offer(`val`)

        if (minHeap.size > k) {
            minHeap.poll()
        }

        return minHeap.peek()
    }
}