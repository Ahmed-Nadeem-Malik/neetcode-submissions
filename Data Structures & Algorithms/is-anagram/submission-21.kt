class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val array = IntArray(26)

        for (i in s.indices) {
            array[s[i] - 'a']++
            array[t[i] - 'a']--
        }

        return array.all { it == 0}
    }
}
