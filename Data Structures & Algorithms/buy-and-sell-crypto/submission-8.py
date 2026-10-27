class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        output = 0
        l = 0

        for r in range(len(prices)):
            if prices[l] < prices[r]:
                p = prices[r] - prices[l]
                output = max(output, p)

            else:
                l = r

            r += 1

        return output
