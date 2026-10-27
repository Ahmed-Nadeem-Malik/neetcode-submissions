class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var output = strs[0]
        for (i in 1 until strs.size) {
            var j = 0
            while (j < min(output.length, strs[i].length)){
                if (output[j] != strs[i][j]) break
                j++
            }
            output = output.slice(0 until j)

        }
        return output
    }
}
