class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val freq1 = HashMap<Char, Int>()
        val freq2 = HashMap<Char, Int>()
        for (c in s1) {
            freq1[c] = freq1.getOrDefault(c, 0) + 1
        }

        var l = 0
        var r = s1.length - 1
        for (i in l..r) {
            freq2[s2[i]] = freq2.getOrDefault(s2[i], 0) + 1
        }

        for (i in r..s2.length - 1) {
            if (freq1 == freq2) return true

            val lChar = s2[l]
            freq2[lChar] = freq2[lChar]!! - 1
            if (freq2[lChar] == 0) freq2.remove(lChar)

            l++
            r++

            if (r < s2.length) {
                val rChar = s2[r]
                freq2[rChar] = freq2.getOrDefault(rChar, 0) + 1
            }
        }

        return false
    }
}
