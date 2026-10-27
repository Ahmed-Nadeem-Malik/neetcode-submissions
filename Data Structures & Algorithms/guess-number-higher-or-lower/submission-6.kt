/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num: Int): Int
 */

class Solution : GuessGame() {
    fun guessNumber(n: Int): Int {
        var l = 1
        var r = n

        while (true) {
            var m = l + (r - l) / 2
            val a = guess(m)
            if (a == -1) {
                r = m - 1
            } else if (a == 1) {
                l = m + 1
            } else {
                return m
            }
        }
        return -1
    }
}
