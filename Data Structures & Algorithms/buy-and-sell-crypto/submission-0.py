class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxVal = 0
        for i in range(len(prices)):
            for j in range(i+1, len(prices)):
                    transaction = prices[j] - prices[i]
                    if transaction > maxVal:
                        maxVal = transaction
                
        return maxVal
