class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashMap = {}

        for num in nums:
            hashMap[num] = 1 + hashMap.get(num, 0)

        for key, val in hashMap.items():
            if val > (len(nums) // 2):
                return key
            else:
                continue

        return -1