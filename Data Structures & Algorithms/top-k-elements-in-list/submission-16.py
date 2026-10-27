class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numToCount = {}

        for num in nums:
            numToCount[num] = 1 + numToCount.get(num, 0)
        
        countToNum = []
        for num, count in numToCount.items():
            countToNum.append((count, num))

        countToNum.sort()

        output = []

        while len(output) < k:
            output.append(countToNum.pop()[1])
            
        return output
