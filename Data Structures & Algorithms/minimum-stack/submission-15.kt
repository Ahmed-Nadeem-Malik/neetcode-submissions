class MinStack() {
    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()

    fun push(value: Int) {
        stack.addLast(value)
        if (minStack.isEmpty()) minStack.addLast(value) else minStack.addLast(minOf(value, minStack.last()))
    }

    fun pop() {
        if (stack.isNotEmpty()) stack.removeLast()
        if (minStack.isNotEmpty()) minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()!!
    }

    fun getMin(): Int {
        return minStack.last()!!
    }
}
