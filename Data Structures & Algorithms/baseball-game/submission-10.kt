class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()

        for (op in operations) {
            when (op) {
                "+" -> stack.add(stack[stack.size - 1] + stack[stack.size - 2])
                "D" -> stack.add(stack[stack.size - 1] * 2)
                "C" -> stack.removeLast()
                else -> stack.add(op.toInt())
            }
        }

        return stack.sum()
    }
}
