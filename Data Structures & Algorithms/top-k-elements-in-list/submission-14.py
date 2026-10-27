class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
# num -> count
# invert it into a count to num
# sort
# pop item
        numToCount = {}
        for num in nums:   
            numToCount[num] = 1 + numToCount.get(num, 0)

        countNum = []
        for num, cnt in numToCount.items():
            countNum.append((cnt, num))

        countNum.sort()

        res = []

        while len(res)< k:
            res.append(countNum.pop()[1])

        return res