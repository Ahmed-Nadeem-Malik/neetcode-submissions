class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map1 = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            map1[s[i]] = 1 + map1.getOrDefault(s[i], 0)
            map2[t[i]] = 1 + map2.getOrDefault(t[i], 0)
        }

        return map1 == map2
    }
}
