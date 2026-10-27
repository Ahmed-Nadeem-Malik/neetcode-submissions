class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)

        L, R = 0 , 0
        maxSell = 0
        while  R < len(prices):
            if prices[L] < prices[R]:
                maxSell = max(maxSell, prices[R]-prices[L])
            else:
                L = R
            R+=1
        return maxSell