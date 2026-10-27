class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = {}
        nums.sort()

        for num in nums:
            if num in hashMap:
                hashMap[num] += 1
            else:
                hashMap[num] = 1

        arr = []

        for num, count in hashMap.items():
            arr.append([count, num])
        
        arr.sort()

        res = []

        for i in range(len(arr) - 1, len(arr) - k - 1, -1):
            res.append(arr[i][1])


        return res




        
