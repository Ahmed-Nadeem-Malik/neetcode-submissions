class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for (char in tokens) {
            val number = char.toIntOrNull()
            if (number != null) {
                stack.add(number)
                continue
            }

            when (char) {
                "+" -> stack.addLast(stack.removeLast() + stack.removeLast())
                "*" -> stack.addLast(stack.removeLast() * stack.removeLast())
                "-" -> {
                    val r = stack.removeLast()
                    val l = stack.removeLast()
                    stack.addLast(l - r)
                }
                "/" -> {
                    val r = stack.removeLast()
                    val l = stack.removeLast()
                    stack.addLast(l / r)
                }
                else -> throw Exception("This should not be a case: $char")
            }
        }
        return stack.first()
    }
}
