class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        hashMap =  {}

        for num in nums:
            if num in hashMap:
                hashMap[num] += 1
            else:
                hashMap[num] = 1

        maxVal = 0
        maxKey = 0
        for key, val in hashMap.items():
            if val > maxVal:
                maxVal = val
                maxKey = key 

        return maxKey