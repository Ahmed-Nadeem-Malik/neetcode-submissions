class Solution {
    fun isValid(s: String): Boolean {
        val bmap = mapOf(
            '}' to '{',
            ']' to '[',
            ')' to '('
        )
        val stack = mutableListOf<Char>()
        for (b in s) {
            if (b !in bmap) {
                stack.add(b)
                continue
            }
            if (stack.isEmpty() || stack.removeLast() != bmap[b]) return false
        }
        return stack.isEmpty()
    }
}
