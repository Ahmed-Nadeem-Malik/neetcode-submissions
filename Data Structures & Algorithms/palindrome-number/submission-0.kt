class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var rev = 0L
        var num = x
        while (num != 0) {
            rev = rev * 10 + num % 10
            num /= 10
        }

        return rev == x.toLong()


    }
}
