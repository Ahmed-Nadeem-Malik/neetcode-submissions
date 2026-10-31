class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val seen = mutableSetOf<Char>()
        var l = 0
        var output = 0
        for (r in s.indices) {
            while (s[r] in seen) seen.remove(s[l++])
            seen.add(s[r])
            output = maxOf(output, r - l + 1)
        }
        return output
    }
}
