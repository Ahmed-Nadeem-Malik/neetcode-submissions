class StockSpanner() {
    val stack = mutableListOf<Int>()

    fun next(price: Int): Int {
        stack.add(price)
        var consecutiveDays = 0
        for (i in stack.lastIndex downTo 0) {
            if (stack[i] > price) return consecutiveDays
            consecutiveDays++
        }
        return consecutiveDays
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * val obj = StockSpanner()
 * val param_1 = obj.next(price)
 */
