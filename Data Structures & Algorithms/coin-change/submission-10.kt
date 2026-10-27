class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { Int.MAX_VALUE }
        dp[0] = 0

        for (a in 1..amount) {
            for (c in coins) {
                if (a >= c && dp[a - c] != Int.MAX_VALUE) {
                    dp[a] = minOf(dp[a], dp[a - c] + 1)
                }
            }
        }

        return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
    }
}
