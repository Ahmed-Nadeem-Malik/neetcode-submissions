class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var l = 0
        var r = 1
        var maxP = 0

        while (r < prices.size) {
            if (prices[r] > prices[l]) {
                val p = prices[r] - prices[l]
                maxP = max(maxP, p)
            } else {
                l = r
            }

            r++
        }
        return maxP
    }
}
