class MyStack() {
    val q = ArrayDeque<Int>()

    fun push(x: Int) {
        q.addLast(x)
    }

    fun pop(): Int {
        if (q.isNotEmpty()) return q.removeLast()
        return -1
    }

    fun top(): Int {
        if (q.isNotEmpty()) return q.last()
        return -1
    }

    fun empty(): Boolean {
        return q.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
