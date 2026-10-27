class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numToCount = {}

        for num in nums:
            numToCount[num] = 1 + numToCount.get(num, 0)
        
        countNum = []
        for num, cnt in numToCount.items():
            countNum.append([cnt, num])

        countNum.sort()

        output = []
        while len(output) < k:
            num = countNum.pop()
            output.append(num[1])

        return output
