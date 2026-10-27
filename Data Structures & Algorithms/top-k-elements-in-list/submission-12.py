class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = {} # num to count
        for num in nums:
            hashMap[num] = 1 + hashMap.get(num, 0)

        arr = []
        for num, count in hashMap.items():
            arr.append([count, num])
        arr.sort()

        output = []
        while len(output) < k:
            output.append(arr.pop()[1])

        return output
