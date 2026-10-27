class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap ={}

        for i in range(len(nums)):
            if nums[i] in hashMap:
                hashMap[nums[i]] +=1
            else:
                hashMap[nums[i]] = 1

        arr = []
        for num, count in hashMap.items():
            arr.append([count, num])

        arr.sort()

        result = []
        for i in range(len(arr) -1, len(arr) - k - 1, -1):
            result.append(arr[i][1])

        return result

            




        
