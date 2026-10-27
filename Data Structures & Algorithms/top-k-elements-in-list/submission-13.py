class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numToCount = {}
        countToNum = []
        output = []

        for num in nums:
            numToCount[num] = 1 + numToCount.get(num, 0)

        for num, count in numToCount.items():
            countToNum.append([count, num])

        countToNum.sort()

        while len(output) < k:
            output.append(countToNum.pop()[1])

        return output 

        