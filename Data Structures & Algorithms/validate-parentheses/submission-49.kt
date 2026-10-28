class Solution {
    fun isValid(s: String): Boolean {
        val map = mutableMapOf<Char, Char>(
            '}' to '{',
            ']' to '[',
            ')' to '('
        )

        val stack = mutableListOf<Char>()

        for (b in s) {
            if (b in map) {
                if (stack.isEmpty() || stack.last() != map[b]) return false
                stack.removeLast()
            } else {
                stack.add(b)
            }
        }

        return stack.isEmpty()
    }
}
