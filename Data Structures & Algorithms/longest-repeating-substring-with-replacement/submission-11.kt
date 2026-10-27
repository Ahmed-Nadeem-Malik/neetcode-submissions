class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val count = mutableMapOf<Char, Int>()
        var output = 0
        var l = 0
        var maxf = 0

        for (r in s.indices) {
            count[s[r]] = count.getOrDefault(s[r], 0) + 1
            maxf = maxOf(maxf, count[s[r]]!!)
 
            while (r - l + 1- maxf > k) {
                count[s[l]] = count[s[l]]!! - 1
                l++
            }

            output = maxOf(output, r - l + 1)
        }
        return output 
    }
}
