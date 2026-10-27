class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val output = mutableListOf<String>()
        val sub = mutableListOf<Char>()

        fun backtrack(o: Int, c: Int) {
            if (o == c && o == n) {
                output.add(sub.joinToString(""))
                return
            }
            if (o < n) {
                sub.add('(')
                backtrack(o + 1, c)
                sub.removeLast()
            }
            if (c < o) {
                sub.add(')')
                backtrack(o, c + 1)
                sub.removeLast()
            }
        }
        backtrack(0,0)
        return output

    }
}
