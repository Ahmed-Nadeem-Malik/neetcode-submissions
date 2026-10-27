class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int> {a, b -> b.compareTo(a)} // max heap
        nums.forEach { pq.add(it) } // n * logn
        var count = k  

        while (count != 1) {
            pq.poll()
            count--
        }

        return pq.poll()
    }
}
