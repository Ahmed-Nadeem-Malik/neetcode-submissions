class Solution {
    fun validPalindrome(s: String): Boolean {
        fun isPalindrome(str: String): Boolean {
            var l = 0
            var r = str.lastIndex
            while (l < r) if (str[l++] != str[r--]) return false
            return true
        }
        isPalindrome(s)
        for (i in s.indices) {
            val str = s.substring(0, i) + s.substring(i + 1)
            if (isPalindrome(str)) return true
        }

        return false
    }
}
