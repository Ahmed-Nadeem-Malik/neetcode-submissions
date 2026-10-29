class Solution {
    fun reverseString(s: CharArray) {
        var l = 0
        var r = s.lastIndex 

        while (l <= r) {
            val tmp = s[l]
            s[l++] = s[r]
            s[r--] = tmp
        }
    }
}
