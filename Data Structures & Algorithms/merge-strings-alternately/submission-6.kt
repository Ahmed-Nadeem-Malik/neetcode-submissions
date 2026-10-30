class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        var output = ""

        while (i < word1.length && j < word2.length) {
            output += word1[i++]
            output += word2[j++]
        }

        if (i < word1.length) output += word1.substring(i)
        if (j < word2.length) output += word2.substring(j)
        return output
    }
}
