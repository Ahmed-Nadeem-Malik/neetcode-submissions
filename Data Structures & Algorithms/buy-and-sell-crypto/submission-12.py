class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maximumProfit = 0
        minimumBuy = prices[0]

        for price in prices:
            maximumProfit = max(maximumProfit, price - minimumBuy)
            minimumBuy = min(minimumBuy, price)

        return maximumProfit