class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = {}
        nums.sort()
        for num in nums:
            if num in hashMap:
                hashMap[num] += 1
            else:
                hashMap[num] = 1

        hashArr = []

        for key, val in hashMap.items():
            hashArr.append([val, key])

        hashArr.sort()

        output = []
        for i in range(len(hashArr) - 1, len(hashArr) - k - 1, -1):
            output.append(hashArr[i][1])

        return output
           




        
