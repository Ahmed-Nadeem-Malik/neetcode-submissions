class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hashMap1 = mutableMapOf<Char, Int>()
        val hashMap2 = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            hashMap1[s[i]] = 1 + hashMap1.getOrDefault(s[i], 0)
            hashMap2[t[i]] = 1 + hashMap2.getOrDefault(t[i], 0)
        } 

        return (hashMap1 == hashMap2)
    }
}
