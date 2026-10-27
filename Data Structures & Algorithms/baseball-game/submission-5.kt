class Solution {
    fun calPoints(operations: Array<String>): Int {
        val arr = mutableListOf<Int>()

        for (op in operations) {
            when (op) {
                "+" -> arr.add(arr[arr.lastIndex] + arr[arr.lastIndex - 1])
                "C" -> arr.removeLast()
                "D" -> arr.add(arr[arr.lastIndex] * 2)
                else -> arr.add(op.toInt())
            }
        }

        return arr.sum()
    }
}