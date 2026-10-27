class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return emptyArray()

        val sorted = intervals.sortedBy { it[0] }
        val output = mutableListOf<MutableList<Int>>()
        output.add(sorted[0].toMutableList())

        for (interval in sorted.drop(1)) {
            val start = interval[0]
            val end = interval[1]
            val lastEnd = output.last()[1]

            if (start <= lastEnd) {
                output.last()[1] = maxOf(end, lastEnd)
            } else {
                output.add(mutableListOf(start, end))
            }
        }

        return output.map { it.toIntArray() }.toTypedArray()
    }
}
