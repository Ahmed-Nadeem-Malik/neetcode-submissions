class Solution {
    fun encode(strs: List<String>): String {
        val output = StringBuilder()
        strs.forEach {str -> output.append(str.length).append('#').append(str)}
        return output.toString() 
    }

    fun decode(str: String): List<String> {
        val output = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while (str[j] != '#') {
                j++
            }
            var length = str.substring(i, j).toIntOrNull() ?: throw Error("out of bounds")
            i = j + 1
            output.add(str.substring(i, i + length))
            i += length
        }

        return output.toList() 
    }
}
