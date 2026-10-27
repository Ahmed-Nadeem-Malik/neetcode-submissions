class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = mutableMapOf<String, MutableList<String>>()

        for (string in strs) {
            val sortedString = string.toCharArray().sortedArray().concatToString()
            hashMap.getOrPut(sortedString) { mutableListOf() }.add(string)
        }

        return hashMap.values.toList()
    }
}