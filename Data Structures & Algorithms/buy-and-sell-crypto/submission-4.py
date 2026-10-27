class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l = 0
        output = 0

        for r in range(len(prices)):
            output = max(output, prices[r] - prices[l])
            if prices[l] > prices[r]:
                l = r
            else:
                r+= 1
        return output
        
