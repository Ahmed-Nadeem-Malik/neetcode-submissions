class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (t in tokens) {
            when (t) {
                "+" -> {
                   val a = stack.removeLast() 
                   val b = stack.removeLast() 
                   stack.addLast(a + b)
                }
                "-" -> {
                    val a = stack.removeLast() 
                    val b = stack.removeLast() 
                    stack.addLast(b - a) 
                }
                "*" -> {
                    val a = stack.removeLast() 
                    val b = stack.removeLast() 
                    stack.addLast(a * b) 
                } 
                "/" -> {
                    val a = stack.removeLast() 
                    val b = stack.removeLast() 
                    stack.addLast(b / a)                    
                }
                else -> {
                    stack.addLast(t.toInt())
                }
            }
        }

        return stack.last()
    }
}
