class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        output = []
        hashMap = {}

        for num in nums:
            hashMap[num] = 1 + hashMap.get(num, 0)

        for key, val in hashMap.items():
            if val > (len(nums) // 3):
                output.append(key)
            else:
                continue

        return output