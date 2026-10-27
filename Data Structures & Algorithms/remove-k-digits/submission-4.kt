class Solution {
    fun removeKdigits(num: String, k: Int): String {
        val stack = mutableListOf<Char>()
        var remaining = k

        for (c in num) {
            while (remaining > 0 &&
                   stack.isNotEmpty() &&
                   stack.last() > c) {
                stack.removeLast()
                remaining--
            }
            stack.add(c)
        }

        while (remaining > 0) {
            stack.removeLast()
            remaining--
        }

        val result = 

        return stack.joinToString("").trimStart('0').ifEmpty {"0"}
    }
}
