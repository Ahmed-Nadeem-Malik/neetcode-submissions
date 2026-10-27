class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val sortedToStrings = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sortedStr = str.toList().sorted().joinToString("")
            if (sortedStr !in sortedToStrings) sortedToStrings[sortedStr] = mutableListOf()
            sortedToStrings[sortedStr]!!.add(str)
        }

        return sortedToStrings.values.toList()

    }
}
