class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return emptyArray()

        intervals.sortBy { it[0] }
        val stack = mutableListOf(intervals[0])

        for (interval in intervals.drop(1)) {
            if (interval[0] > stack.last()[1]) {
                stack.add(interval)
                continue
            }

            val previous = stack.removeLast()
            stack.add(
                intArrayOf(
                    previous[0],
                    maxOf(previous[1], interval[1])
                )
            )
        }

        return stack.toTypedArray()
    }
}
