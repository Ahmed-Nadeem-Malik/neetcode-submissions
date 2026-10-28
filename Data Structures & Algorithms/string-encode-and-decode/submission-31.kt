class Solution {
    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (str in strs) {
            sb.append(str.length).append("*").append(str)
        }
        return sb.toString()
    }
    
    fun decode(str: String): List<String> {
        val output = mutableListOf<String>()
        var i = 0
        while (i < str.length) {
            var j = i
            while (str[j] != '*') j++
            val len = str.substring(i, j).toInt()
            val start = j + 1
            i = start + len
            output.add(str.substring(start, i))
        }
        return output
    }
}