class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var res = 0
        val hashSet = mutableSetOf<Char>()
        var l = 0

        for (r in s.indices) {
            while (s[r] in hashSet) {
                hashSet.remove(s[l])
                l++
            }
            hashSet.add(s[r])
            res = maxOf(r - l + 1, res)
        } 
        return res
    }
}
