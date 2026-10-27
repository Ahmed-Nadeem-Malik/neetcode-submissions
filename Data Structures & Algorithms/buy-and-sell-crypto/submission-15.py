class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        curMin = prices[0]

        for price in prices:
            if price <= curMin:
                curMin = price
                continue

            profit = max(profit, price - curMin)

        return profit
            

        