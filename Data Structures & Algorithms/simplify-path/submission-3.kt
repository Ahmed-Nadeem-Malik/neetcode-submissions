class Solution {
    fun simplifyPath(path: String): String {
        val stack = mutableListOf<String>()
        val parts = path.split("/")

        for (cur in parts) {
            if (cur == "..") {
                if (stack.isNotEmpty()) stack.removeLast()
            } else if (cur != "" && cur != ".") {
                stack.addLast(cur)
            }
        }

        return "/" + stack.joinToString("/")

    }
}
