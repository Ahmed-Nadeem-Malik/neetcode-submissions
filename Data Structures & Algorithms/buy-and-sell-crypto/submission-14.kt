class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var curBuy = prices[0]
        for (price in prices) {
            if (curBuy < price) { res = maxOf((price - curBuy), res) }
            curBuy = minOf(curBuy, price)
        }
        return res
    }
}
