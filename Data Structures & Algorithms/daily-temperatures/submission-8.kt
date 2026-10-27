class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val res = IntArray(temperatures.size) {0}
        val stack = mutableListOf<Int>()
        
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val removedItem = stack.removeLast()
                res[removedItem] = i - removedItem
            }
            stack.add(i)
        }
        return res
    }
}
